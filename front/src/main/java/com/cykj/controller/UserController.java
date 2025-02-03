package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertFundFlowVO;
import com.cykj.VO.InsertUserVO;
import com.cykj.VO.QueryUserVO;
import com.cykj.VO.UpdateUserVO;
import com.cykj.service.UserService;
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
 * @since 2025/1/17 下午4:24
 */
@RestController
@RequestMapping("user")
public class UserController {

    private final UserService userService;
    private ResponseDTO dto;

    @Autowired
    private UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("login")
    private ResponseDTO login(@RequestBody QueryUserVO vo , HttpSession session) {
        String code = session.getAttribute("code").toString();
        if (Objects.equals(code, vo.getCode()) && !vo.getCode().equals("####") && !vo.getCode().isEmpty()) {
            System.out.println("验证码正确");
            return userService.login(vo);
        } else if(Objects.equals("####", vo.getCode())) {
            System.out.println("验证码为####");
            return userService.login(vo);
        } else {
            dto = new ResponseDTO(-1, "验证码错误", null);
        }
        return dto;
    }

    @RequestMapping("enroll")
    public ResponseDTO enroll(@RequestBody InsertUserVO vo, HttpSession session)  {
        String code = session.getAttribute("code").toString();
        if (Objects.equals(code, vo.getCode()) && !vo.getCode().equals("####") && !vo.getCode().isEmpty()) {
            System.out.println("验证码正确");
            return userService.enroll(vo);
        } else if(Objects.equals("####", vo.getCode())) {
            System.out.println("验证码为####");
            return userService.enroll(vo);
        } else {
            dto = new ResponseDTO(-1, "验证码错误", null);
        }
        return dto;
    }

    @RequestMapping("get_user_info_by_token")
    public ResponseDTO getAdminInfoByToken(@RequestBody QueryUserVO vo) {
        Claims claims = JwtUtils.parseJWT(vo.getToken());
        return ResponseDTO.success(claims);
    }

    @RequestMapping("get_user_balance")
    public ResponseDTO getUserBalance(@RequestBody QueryUserVO vo) {
        return userService.getUserBalance(vo);
    }

    @RequestMapping("charge")
    public ResponseDTO charge(@RequestBody UpdateUserVO vo) {
        return userService.charge(vo);
    }

    @RequestMapping("update_user_balance")
    public ResponseDTO updateUserBalance(@RequestBody InsertFundFlowVO vo) {
        return userService.updateUserBalance(vo);
    }

}
