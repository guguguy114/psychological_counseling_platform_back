package com.cykj.service.impl;

import com.cykj.DO.Consultant;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryConsultantVO;
import com.cykj.mapper.ConsultantMapper;
import com.cykj.service.ConsultantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

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
    public ResponseDTO getConsultantById(QueryConsultantVO vo) {
        Consultant consultant = mapper.getConsultantById(vo);
        if (consultant == null) {
            return ResponseDTO.error("获取咨询师信息失败");
        } else {
            return ResponseDTO.success(consultant);
        }
    }
}
