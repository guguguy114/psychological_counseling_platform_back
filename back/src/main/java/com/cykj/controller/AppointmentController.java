package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryAppointmentVO;
import com.cykj.VO.UpdateAppointmentVO;
import com.cykj.service.AppointmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/6 下午10:06
 */
@RestController
@RequestMapping("/appointment")
public class AppointmentController {

    private final AppointmentService appointmentService;

    @Autowired
    private AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @RequestMapping("/get_appointment")
    public ResponseDTO getAppointment(@RequestBody QueryAppointmentVO vo)   {
        return appointmentService.getAppointment(vo);
    }

    @RequestMapping("/update_appointment_by_id")
    public ResponseDTO updateAppointmentById(@RequestBody UpdateAppointmentVO vo)   {
        return appointmentService.updateAppointmentById(vo);
    }
}
