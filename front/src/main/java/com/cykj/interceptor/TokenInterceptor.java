package com.cykj.interceptor;

import com.alibaba.fastjson.JSON;
import com.cykj.DTO.ResponseDTO;
import com.cykj.util.JwtUtils;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/14 下午4:18
 */
public class TokenInterceptor implements HandlerInterceptor {
    public boolean preHandle(final HttpServletRequest request, final HttpServletResponse response, final Object handler) throws Exception {
        /*
            return true 放行
            return false 拦截
         */

        // 获取请求头
        String token = request.getHeader("Token");

        // token为空时拦截
        if (token == null || token.isEmpty()) {
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSON.toJSONString(new ResponseDTO(-6, "没有token", null)));
            return false;
        }



        // token过期拦截
        try {
            System.out.println(JwtUtils.parseJWT(token));
        } catch (Exception e) {
            response.setContentType("application/json;charset=utf-8");
            response.getWriter().write(JSON.toJSONString(new ResponseDTO(-7, "token过期", null)));
            return false;
        }


        return true;
    }
}
