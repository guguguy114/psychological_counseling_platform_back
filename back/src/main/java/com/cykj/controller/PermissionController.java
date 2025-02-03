package com.cykj.controller;

import com.cykj.DO.Permission;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.DeletePermissionVO;
import com.cykj.VO.InsertPermissionVO;
import com.cykj.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/23 上午12:59
 */
@RestController
@RequestMapping("permission")
public class PermissionController {

    private final PermissionService permissionService;

    @Autowired
    private PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @RequestMapping("insert_permission_by_role")
    public ResponseDTO insertPermissionByRole(@RequestBody InsertPermissionVO vo) {
        System.out.println("add:"+vo);
        return permissionService.insertPermissionByRole(vo);
    }

    @RequestMapping("delete_permission_by_role")
    public ResponseDTO deletePermissionByRole(@RequestBody DeletePermissionVO vo) {
        System.out.println("delete:"+vo);
        return permissionService.deletePermissionByRole(vo);
    }

}
