package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/22 下午1:25
 */
@RestController
@RequestMapping("role")
public class RoleController {

    private RoleService roleService;

    @Autowired
    private RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @RequestMapping("get_all")
    public ResponseDTO getAllRole() {
        return roleService.getAllRole();
    }

}
