package com.cykj.service.impl;

import com.cykj.DO.Menu;
import com.cykj.DTO.ResponseDTO;
import com.cykj.mapper.MenuMapper;
import com.cykj.service.MenuService;
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
    public ResponseDTO getMenu() {
        List<Menu> menus = mapper.queryMenu();
        List<Menu> menuTree = getMenuTree(menus);
        if (!menus.isEmpty()) {
            dto = ResponseDTO.success(menuTree);
        } else {
            dto = ResponseDTO.error("no menu found");
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
