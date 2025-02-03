package com.cykj.service.impl;

import com.cykj.DO.Role;
import com.cykj.DTO.ResponseDTO;
import com.cykj.mapper.RoleMapper;
import com.cykj.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/22 下午1:29
 */
@Service
public class RoleServiceImpl implements RoleService {

    private final RoleMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private RoleServiceImpl(RoleMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getAllRole() {
        List<Role> roles = mapper.selectAllRole();
        if (!roles.isEmpty()) {
            dto = ResponseDTO.success(roles);
        } else {
            dto = ResponseDTO.error("NO ROLE FOUND");
        }
        return dto;
    }
}
