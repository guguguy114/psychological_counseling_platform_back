package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertAppointmentTimeVO;
import com.cykj.VO.QueryAppointmentTimeVO;
import com.cykj.service.AppointmentTimeService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/5 下午11:07
 */
@RestController
@RequestMapping("/appointment_time")
public class AppointmentTimeController {

    private final AppointmentTimeService appointmentTimeService;

    private AppointmentTimeController(AppointmentTimeService appointmentTimeService) {
        this.appointmentTimeService = appointmentTimeService;
    }

    @RequestMapping("/insert_appointment_time")
    public ResponseDTO insertAppointmentTime(@RequestBody InsertAppointmentTimeVO vo)  {
        return appointmentTimeService.insertAppointmentTime(vo);
    }

    @RequestMapping("/get_appointment_time_by_consultant_id")
    public ResponseDTO getAppointmentTimeByConsultantId(@RequestBody QueryAppointmentTimeVO vo)  {
        return appointmentTimeService.getAppointmentTimeByConsultantId(vo);
    }

}
