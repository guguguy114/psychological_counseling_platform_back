package com.cykj.service.impl;

import com.cykj.DO.Menu;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertMenuVO;
import com.cykj.VO.QueryMenuVO;
import com.cykj.VO.UpdateMenuVO;
import com.cykj.mapper.MenuMapper;
import com.cykj.service.MenuService;
import com.cykj.util.PageInfoResult;
import com.cykj.util.PageResultUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/8 下午5:22
 */
@Service
public class MenuServiceImpl implements MenuService {

    private final MenuMapper mapper;

    private ResponseDTO dto;


    @Autowired
    private MenuServiceImpl(MenuMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getMenuByAdminId(QueryMenuVO vo) {
        List<Menu> menus = mapper.queryMenuByAdminId(vo);
        List<Menu> menuTree = getMenuTree(menus);
        if (!menus.isEmpty()) {
            dto = ResponseDTO.success(menuTree);
        } else {
            dto = ResponseDTO.error("no menu found");
        }
        return dto;
    }

    /**
     * Description: 根据roleId获取对应菜单
     * @param vo 表单对象
     * @return com.cykj.DTO.ResponseDTO
     * @author Guguguy
     * @since 2025/1/13 下午2:51
     */
    @Override
    public ResponseDTO getMenuByRoleId(QueryMenuVO vo) {
        List<Menu> menus = mapper.queryMenuByRoleId(vo);
        List<Menu> menuTree = getMenuTree(menus);
        if (!menus.isEmpty()) {
            dto = ResponseDTO.success(menuTree);
        } else {
            dto = ResponseDTO.error("no menu found");
        }
        return dto;
    }

    @Override
    public ResponseDTO getMenuByRoleIdOther(QueryMenuVO vo) {
        List<Menu> menus = mapper.queryMenuByRoleIdOther(vo);
        List<Menu> menuTree = getMenuTree(menus);
        if (!menus.isEmpty()) {
            dto = ResponseDTO.success(menuTree);
        } else {
            dto = ResponseDTO.error("no menu found");
        }
        return dto;
    }

    @Override
    public ResponseDTO getMenu(QueryMenuVO vo) {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<Menu> list = mapper.queryMenu(vo);
        PageInfo<Menu> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }

    @Override
    public ResponseDTO getAllParentMenu(QueryMenuVO vo) {
        List<Menu> list = mapper.queryAllParentMenu(vo);
        if (!list.isEmpty()) {
            dto = ResponseDTO.success(list);
        } else {
            dto = ResponseDTO.error("no menu found");
        }
        return dto;
    }

    @Override
    public ResponseDTO updateMenu(UpdateMenuVO vo) {
        Integer result = mapper.updateMenu(vo);
        if (result > 0) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error("can't update menu");
        }
        return dto;
    }

    @Override
    public ResponseDTO insertMenu(InsertMenuVO vo) {
        Integer result = mapper.insertMenu(vo);
        if (result > 0) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error("can't insert menu");
        }
        return dto;
    }




    /**
     * Description: 扫描所有一级菜单并往下遍历
     * @param menus 全部菜单
     * @return java.util.List<com.cykj.DO.Menu>
     * @author Guguguy
     * @since 2025/1/21 下午1:46
     */
    private List<Menu> getMenuTree(List<Menu> menus) {
        List<Menu> menuTree = new ArrayList<>();
        for (Menu menu : menus) {
            if (menu.getMenuParentId() == 0) {
                getChildMenus(menu, menus);
                menuTree.add(menu);
            }
        }
        return menuTree;
    }
    /**
     * Description: 递归查询所有子菜单，查询到导入菜单中的菜单数组
     * @param menu 需要查找子菜单的父菜单
     * @param menus 全菜单
     * @author Guguguy
     * @since 2025/1/9 下午3:02
     */
    private void getChildMenus(Menu menu, List<Menu> menus) {
        for (Menu subMenu : menus) {
            if (Objects.equals(subMenu.getMenuParentId(), menu.getMenuId())) {
                menu.getChildrenMenu().add(subMenu);
                getChildMenus(subMenu, menus);
            }
        }
    }

}
