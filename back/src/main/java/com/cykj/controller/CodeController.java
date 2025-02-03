package com.cykj.controller;

import com.cykj.util.ImageCodeUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午10:34
 */
@RestController
@RequestMapping("code")
public class CodeController {

    @GetMapping("get_code")
    public void getCode(HttpServletResponse response, HttpSession session) throws IOException {
        ImageCodeUtils imageCodeUtils = new ImageCodeUtils();
        String code = imageCodeUtils.getCode();
        imageCodeUtils.write(response.getOutputStream());
        System.out.println("code:"+code);
        session.setAttribute("code", code);
    }

}
