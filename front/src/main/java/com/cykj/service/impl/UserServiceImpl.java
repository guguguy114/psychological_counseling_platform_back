package com.cykj.service.impl;

import com.cykj.DO.User;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertFundFlowVO;
import com.cykj.VO.InsertUserVO;
import com.cykj.VO.QueryUserVO;
import com.cykj.VO.UpdateUserVO;
import com.cykj.mapper.FundFlowMapper;
import com.cykj.mapper.UserMapper;
import com.cykj.service.UserService;
import com.cykj.util.JwtUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.HashMap;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午4:33
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;

    private final FundFlowMapper fundFlowMapper;

    private ResponseDTO dto;

    @Autowired
    private UserServiceImpl(UserMapper mapper, FundFlowMapper fundFlowMapper)  {
        this.fundFlowMapper = fundFlowMapper;
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO login(QueryUserVO vo) {
        User user = mapper.login(vo);
        if (user != null) {
            HashMap<String, Object> map = new HashMap<>();
            map.put("userId", user.getUserId());
            map.put("name", user.getUserName());
            String token = JwtUtils.generateJwt(map);
            dto = ResponseDTO.success(token);
        } else {
            dto = ResponseDTO.error("no user found");
        }
        return dto;
    }

    @Override
    public ResponseDTO enroll(InsertUserVO vo) {
        Integer result = 0;
        try {
            result = mapper.insertUser(vo);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (cause instanceof SQLIntegrityConstraintViolationException) {
                dto = new ResponseDTO(-11, "账号已存在，请重新输入账号", null);
            } else {
                dto = ResponseDTO.error("enroll failed");
            }
            return dto;
        }
        if (result == 1) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error("enroll failed");
        }
        return dto;
    }

    @Override
    public ResponseDTO getUserBalance(QueryUserVO vo) {
        BigDecimal balance = mapper.getUserBalance(vo);
        if (balance != null) {
            dto = ResponseDTO.success(balance);
        } else {
            dto = ResponseDTO.error("账户错误");
        }
        return dto;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseDTO charge(UpdateUserVO vo) {
        Integer result = mapper.charge(vo);
        if (result == 1) {
            result = fundFlowMapper.insertFundFlow(new InsertFundFlowVO(vo.getUserId(), null, 1L, 1L, vo.getChargeMoney()));
            if (result == 1) {
                dto = ResponseDTO.success(result);
            } else {
                dto = ResponseDTO.error("充值失败，插入流水失败");
            }
        } else {
            dto = ResponseDTO.error("充值失败");
        }
        return dto;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseDTO updateUserBalance(InsertFundFlowVO vo) {
        Integer result = mapper.updateBalance(vo);
        if (result == 1) {
            result = fundFlowMapper.insertFundFlow(vo);
            if (result == 1) {
                dto = ResponseDTO.success(result);
            } else {
                dto = ResponseDTO.error("更新余额失败，插入流水失败");
            }
        } else {
            dto = ResponseDTO.error("更新余额失败");
        }
        return dto;
    }


}
