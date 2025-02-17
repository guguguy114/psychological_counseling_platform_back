package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryConsultantVO;
import com.cykj.service.ConsultantService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/5 下午3:02
 */
@RestController
@RequestMapping("/consultant")
public class ConsultantController {

    private final ConsultantService consultantService;

    private ConsultantController(ConsultantService consultantService) {
        this.consultantService = consultantService;
    }

    @RequestMapping("/get_balance")
    public ResponseDTO getBalance(@RequestBody QueryConsultantVO vo)  {
        return consultantService.getBalance(vo);
    }

    @RequestMapping("/get_consultant_by_admin_id")
    public ResponseDTO getConsultantByAdminId(@RequestBody QueryConsultantVO vo)  {
        return consultantService.getConsultantByAdminId(vo);
    }

    @RequestMapping("/get_all")
    public ResponseDTO getAll()  {
        return consultantService.getAll();
    }
}
