package com.cykj.service.impl;

import com.cykj.DO.Appointment;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertFundFlowVO;
import com.cykj.VO.QueryAppointmentVO;
import com.cykj.VO.QueryUserVO;
import com.cykj.VO.UpdateAppointmentVO;
import com.cykj.mapper.AppointmentMapper;
import com.cykj.mapper.ConsultantMapper;
import com.cykj.mapper.FundFlowMapper;
import com.cykj.mapper.UserMapper;
import com.cykj.service.AppointmentService;
import com.cykj.util.PageInfoResult;
import com.cykj.util.PageResultUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/6 下午10:08
 */
@Service
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentMapper mapper;

    private final UserMapper userMapper;

    private final ConsultantMapper consultantMapper;

    private final FundFlowMapper fundFlowMapper;

    private ResponseDTO dto;

    @Autowired
    private AppointmentServiceImpl(AppointmentMapper mapper, UserMapper userMapper, FundFlowMapper fundFlowMapper, ConsultantMapper consultantMapper) {
        this.consultantMapper = consultantMapper;
        this.fundFlowMapper = fundFlowMapper;
        this.userMapper = userMapper;
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getAppointment(QueryAppointmentVO vo)  {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<Appointment> list = mapper.queryAppointment(vo);
        PageInfo<Appointment> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseDTO updateAppointmentById(UpdateAppointmentVO vo) {
        // 确认时进行扣款操作
        if (vo.getAppointmentStatus() == 2L) {
            // 确认账户有钱
            QueryUserVO userVO = new QueryUserVO();
            userVO.setUserId(vo.getUserId());
            if (userMapper.getUserBalance(userVO).compareTo(vo.getAppointmentPrice()) < 0) {
                dto = new ResponseDTO(-12, "确认失败，用户余额不足，请提醒其充值", null);
                return dto;
            }
            // 创建流水
            InsertFundFlowVO insertFundFlowVO = new InsertFundFlowVO();
            insertFundFlowVO.setUserId(vo.getUserId());
            insertFundFlowVO.setFundFlowType(0L);
            insertFundFlowVO.setConsultantId(vo.getConsultantId());
            insertFundFlowVO.setFundFlowEvent(2L);
            insertFundFlowVO.setFundFlow(vo.getAppointmentPrice());
            fundFlowMapper.insertFundFlow(insertFundFlowVO);
            // 更新用户账户
            userMapper.updateBalance(insertFundFlowVO);
            // 更新咨询师账户
            consultantMapper.updateBalance(insertFundFlowVO);

        }

        Integer result = mapper.updateAppointmentById(vo);
        if (result == 1) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error("update appointment failed");
        }
        return dto;
    }
}
