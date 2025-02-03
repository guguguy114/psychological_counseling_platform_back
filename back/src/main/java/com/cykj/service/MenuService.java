package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertMenuVO;
import com.cykj.VO.QueryMenuVO;
import com.cykj.VO.UpdateMenuVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/8 下午5:21
 */
public interface MenuService {

    ResponseDTO getMenuByAdminId(QueryMenuVO vo);

    ResponseDTO getMenuByRoleId(QueryMenuVO vo);

    ResponseDTO getMenu(QueryMenuVO vo);

    ResponseDTO getAllParentMenu(QueryMenuVO vo);

    ResponseDTO updateMenu(UpdateMenuVO vo);

    ResponseDTO insertMenu(InsertMenuVO vo);

    ResponseDTO getMenuByRoleIdOther(QueryMenuVO vo);
}
