package com.cykj.service.impl;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.DeletePermissionVO;
import com.cykj.VO.InsertPermissionVO;
import com.cykj.mapper.PermissionMapper;
import com.cykj.mapper.RoleMapper;
import com.cykj.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/23 上午1:21
 */
@Service
public class PermissionServiceImpl implements PermissionService {

    private final PermissionMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private PermissionServiceImpl(PermissionMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO insertPermissionByRole(InsertPermissionVO vo) {
        Integer res = mapper.insertPermissionByRole(vo);
        return ResponseDTO.success(res);
    }

    @Override
    public ResponseDTO deletePermissionByRole(DeletePermissionVO vo) {
        Integer res = mapper.deletePermissionByRole(vo);
        return ResponseDTO.success(res);
    }
}
