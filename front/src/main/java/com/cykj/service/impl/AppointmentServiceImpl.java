package com.cykj.service.impl;

import com.cykj.DO.Appointment;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryAppointmentVO;
import com.cykj.VO.UpdateAppointmentVO;
import com.cykj.mapper.AppointmentMapper;
import com.cykj.service.AppointmentService;
import com.cykj.util.PageInfoResult;
import com.cykj.util.PageResultUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    private ResponseDTO dto;

    @Autowired
    private AppointmentServiceImpl(AppointmentMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getAppointment(QueryAppointmentVO vo)  {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<Appointment> list = mapper.queryAppointmentByTimeRangeAndStatus(vo);
        PageInfo<Appointment> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }

    @Override
    public ResponseDTO updateAppointmentById(UpdateAppointmentVO vo) {
        Integer result = mapper.updateAppointmentById(vo);
        if (result == 1) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error("update appointment failed");
        }
        return dto;
    }
}
