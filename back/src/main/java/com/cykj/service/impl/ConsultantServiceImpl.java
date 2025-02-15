package com.cykj.service.impl;

import com.cykj.DO.Consultant;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryConsultantVO;
import com.cykj.mapper.ConsultantMapper;
import com.cykj.service.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/5 下午3:03
 */
@Service
public class ConsultantServiceImpl implements ConsultantService {

    private final ConsultantMapper mapper;

    @Autowired
    private ConsultantServiceImpl(ConsultantMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getBalance(QueryConsultantVO vo) {
        BigDecimal balance = mapper.getBalance(vo);
        if (balance == null) {
            return ResponseDTO.error("获取余额失败");
        } else {
            return ResponseDTO.success(balance);
        }
    }

    @Override
    public ResponseDTO getConsultantByAdminId(QueryConsultantVO vo) {
        Consultant consultant = mapper.getConsultantByAdminId(vo);
        if (consultant == null) {
            return ResponseDTO.error("获取用户信息失败");
        } else {
            return ResponseDTO.success(consultant);
        }
    }

    @Override
    public ResponseDTO getAll() {
        List<Consultant> consultants = mapper.getAll();
        if (consultants == null) {
            return ResponseDTO.error("获取用户信息失败");
        } else {
            return ResponseDTO.success(consultants);
        }
    }
}
