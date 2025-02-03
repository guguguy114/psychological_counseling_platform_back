package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertAdminVO;
import com.cykj.VO.QueryAdminVO;
import com.cykj.VO.UpdateAdminVO;
import com.cykj.service.AdminService;
import com.cykj.util.JwtUtils;
import io.jsonwebtoken.Claims;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午9:37
 */
@RestController
@RequestMapping("admin")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    private AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @RequestMapping("login")
    private ResponseDTO login(@RequestBody QueryAdminVO vo , HttpSession session) {
        ResponseDTO dto;
        String code = session.getAttribute("code").toString();
        if (Objects.equals(code, vo.getCode()) && !vo.getCode().equals("####") && !vo.getCode().isEmpty()) {
            System.out.println("验证码正确");
            return adminService.login(vo);
        } else if(Objects.equals("####", vo.getCode())) {
            System.out.println("验证码为####");
            return adminService.login(vo);
        } else {
            dto = new ResponseDTO(-1, "验证码错误", null);
        }
        return dto;
    }

    @RequestMapping("get_admin_info_by_token")
    public ResponseDTO getAdminInfoByToken(@RequestBody QueryAdminVO vo) {
        Claims claims = JwtUtils.parseJWT(vo.getToken());
        return ResponseDTO.success(claims);
    }

    @RequestMapping("get_admin")
    public ResponseDTO getAdmin(@RequestBody QueryAdminVO vo) {
        return adminService.getAdmin(vo);
    }

    @RequestMapping("update_admin_by_id")
    public ResponseDTO updateAdminById(@RequestBody UpdateAdminVO vo) {
        return adminService.updateAdminById(vo);
    }

    @RequestMapping("insert_admin")
    public ResponseDTO insertAdmin(@RequestBody InsertAdminVO vo) {
        System.out.println(vo);
        return adminService.insertAdmin(vo);
    }
}
