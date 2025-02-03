package com.cykj.service;

import com.cykj.DO.Permission;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.DeletePermissionVO;
import com.cykj.VO.InsertPermissionVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/23 上午1:20
 */
public interface PermissionService {

    ResponseDTO insertPermissionByRole(InsertPermissionVO vo);

    ResponseDTO deletePermissionByRole(DeletePermissionVO vo);

}
