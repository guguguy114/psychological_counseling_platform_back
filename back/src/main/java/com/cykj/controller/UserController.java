package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryUserVO;
import com.cykj.VO.UpdateUserVO;
import com.cykj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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

    @Autowired
    private UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("get_user_by_name_and_status")
    public ResponseDTO getUserByNameAndStatus(@RequestBody QueryUserVO vo) {
        System.out.println(vo);
        return userService.getUserByNameAndStatus(vo);
    }

    @RequestMapping("update_user_by_id")
    public ResponseDTO updateUserById(@RequestBody UpdateUserVO vo) {
        return userService.updateUserById(vo);
    }

    @RequestMapping("get_user_count_by_date_range")
    public ResponseDTO getUserCountByDateRange(@RequestBody QueryUserVO vo) {
        System.out.println(vo);
        return userService.getUserCountByDateRange(vo);
    }

}
