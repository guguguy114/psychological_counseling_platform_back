package com.cykj.mapper;

import com.cykj.DO.Admin;
import com.cykj.VO.InsertAdminVO;
import com.cykj.VO.QueryAdminVO;
import com.cykj.VO.UpdateAdminVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午9:40
 */
@Mapper
public interface AdminMapper {

    Admin login(QueryAdminVO vo);

    List<Admin> queryAdmin(QueryAdminVO vo);

    Integer updateAdminById(UpdateAdminVO vo);

    Integer insertAdmin(InsertAdminVO vo);
}
