package com.cykj.service.impl;

import com.cykj.DO.AppointmentTime;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertAppointmentTimeVO;
import com.cykj.VO.QueryAppointmentTimeVO;
import com.cykj.mapper.AppointmentTimeMapper;
import com.cykj.service.AppointmentTimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/5 下午11:08
 */
@Service
public class AppointmentTimeServiceImpl implements AppointmentTimeService {

    private final AppointmentTimeMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private AppointmentTimeServiceImpl(AppointmentTimeMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getAppointmentTimeByConsultantId(QueryAppointmentTimeVO vo) {
        List<AppointmentTime> list = mapper.queryAppointmentTimeByCourseId(vo);
        if (!list.isEmpty()) {
            dto = ResponseDTO.success(list);
        } else {
            dto = ResponseDTO.error("暂无数据");
        }
        return dto;
    }
}
