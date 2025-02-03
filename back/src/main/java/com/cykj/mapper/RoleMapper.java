package com.cykj.mapper;

import com.cykj.DO.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/22 下午1:30
 */
@Mapper
public interface RoleMapper {

    List<Role> selectAllRole();

}
