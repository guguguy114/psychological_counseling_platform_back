package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/16 下午5:11
 */
@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("test")
    public ResponseDTO test() {
        System.out.println("测试");
        return ResponseDTO.success("测试");
    }

}
