package com.cykj.mapper;

import com.cykj.DO.Menu;
import com.cykj.VO.InsertMenuVO;
import com.cykj.VO.QueryMenuVO;
import com.cykj.VO.UpdateMenuVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午11:33
 */
@Mapper
public interface MenuMapper {
    List<Menu> queryMenuByRoleId(QueryMenuVO vo);

    List<Menu> queryMenuByAdminId(QueryMenuVO vo);

    List<Menu> queryMenu(QueryMenuVO vo);

    List<Menu> queryAllParentMenu(QueryMenuVO vo);

    Integer updateMenu(UpdateMenuVO vo);

    Integer insertMenu(InsertMenuVO vo);

    List<Menu> queryMenuByRoleIdOther(QueryMenuVO vo);
}
