package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryAppointmentTimeVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/5 下午11:08
 */
public interface AppointmentTimeService {
    ResponseDTO getAppointmentTimeByConsultantId(QueryAppointmentTimeVO vo);
}
