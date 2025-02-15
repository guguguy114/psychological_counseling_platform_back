package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryAppointmentVO;
import com.cykj.VO.UpdateAppointmentVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/6 下午10:08
 */
public interface AppointmentService {

    ResponseDTO getAppointment(QueryAppointmentVO vo);

    ResponseDTO updateAppointmentById(UpdateAppointmentVO vo);

    ResponseDTO getAppointmentCountByDataRange(QueryAppointmentVO vo);
}
