package com.cykj.service.impl;

import com.cykj.DO.Appointment;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertAppointmentVO;
import com.cykj.VO.QueryAppointmentVO;
import com.cykj.VO.UpdateAppointmentTimeVO;
import com.cykj.VO.UpdateAppointmentVO;
import com.cykj.mapper.AppointmentMapper;
import com.cykj.mapper.AppointmentTimeMapper;
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

    private final AppointmentTimeMapper appointmentTimeMapper;

    private ResponseDTO dto;

    @Autowired
    private AppointmentServiceImpl(AppointmentMapper mapper, AppointmentTimeMapper appointmentTimeMapper)  {
        this.appointmentTimeMapper = appointmentTimeMapper;
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

    @Override
    public ResponseDTO getAppointmentByConsultantId(QueryAppointmentVO vo) {
        List<Appointment> list = mapper.queryAppointmentByConsultantId(vo);
        if (list == null) {
            dto = ResponseDTO.error("获取咨询师预约信息失败");
        } else {
            dto = ResponseDTO.success(list);
        }
        return dto;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseDTO insertAppointment(InsertAppointmentVO vo) {
        // todo update and insert
        Integer result = appointmentTimeMapper.updateAppointmentTimeById(new UpdateAppointmentTimeVO(vo.getAppointmentTimeId(), vo.getUserId()));
        if (result == 1) {
            result = mapper.insertAppointment(vo);
            if (result == 1) {
                dto = ResponseDTO.success(result);
            } else {
                dto = ResponseDTO.error("insert appointment failed");
            }
        } else {
            dto = ResponseDTO.error("update appointment time failed");
        }
        return dto;
    }
}
