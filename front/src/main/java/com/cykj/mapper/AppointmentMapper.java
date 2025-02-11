package com.cykj.mapper;

import com.cykj.DO.Appointment;
import com.cykj.VO.QueryAppointmentVO;
import com.cykj.VO.UpdateAppointmentVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/6 下午10:07
 */
@Mapper
public interface AppointmentMapper {

    List<Appointment> queryAppointmentByTimeRangeAndStatus(QueryAppointmentVO vo);

    Integer updateAppointmentById(UpdateAppointmentVO vo);

    List<Appointment> queryAppointmentByConsultantId(QueryAppointmentVO vo);
}
