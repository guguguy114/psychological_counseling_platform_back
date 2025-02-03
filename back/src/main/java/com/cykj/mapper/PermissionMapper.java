package com.cykj.mapper;

import com.cykj.DO.Permission;
import com.cykj.VO.DeletePermissionVO;
import com.cykj.VO.InsertPermissionVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/23 上午1:00
 */
@Mapper
public interface PermissionMapper {

    Integer insertPermissionByRole(InsertPermissionVO vo);

    Integer deletePermissionByRole(DeletePermissionVO vo);

}
