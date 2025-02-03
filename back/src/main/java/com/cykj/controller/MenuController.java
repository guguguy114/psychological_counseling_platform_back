package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertMenuVO;
import com.cykj.VO.QueryMenuVO;
import com.cykj.VO.UpdateMenuVO;
import com.cykj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午11:15
 */
@RestController
@RequestMapping("menu")
public class MenuController {

    private final MenuService menuService;

    @Autowired
    private MenuController(MenuService menuService) {
        this.menuService = menuService;
    }

    @RequestMapping("get_menu")
    public ResponseDTO getMenuByAdminId(@RequestBody QueryMenuVO vo) {
        return menuService.getMenuByAdminId(vo);
    }

    /**
     * Description: 这个主要是用来进行分页查询，上面那个是用来根据角色获取菜单
     * @param vo 查询表单实体
     * @return com.cykj.DTO.ResponseDTO
     * @author Guguguy
     * @since 2025/1/21 下午1:39
     */
    @RequestMapping("get_menu_d")
    public ResponseDTO getMenu(@RequestBody QueryMenuVO vo) {
        return menuService.getMenu(vo);
    }

    @RequestMapping("get_menu_by_role")
    public ResponseDTO getMenuByRole(@RequestBody QueryMenuVO vo) {
        return menuService.getMenuByRoleId(vo);
    }

    @RequestMapping("get_menu_by_role_other")
    public ResponseDTO getMenuByRoleOther(@RequestBody QueryMenuVO vo) {
        return menuService.getMenuByRoleIdOther(vo);
    }

    @RequestMapping("get_all_parent_menu")
    public ResponseDTO getAllParentMenu(QueryMenuVO vo) {
        return menuService.getAllParentMenu(vo);
    }

    @RequestMapping("update_menu")
    public ResponseDTO updateMenu(@RequestBody UpdateMenuVO vo) {
        return menuService.updateMenu(vo);
    }

    @RequestMapping("insert_menu")
    public ResponseDTO insertMenu(@RequestBody InsertMenuVO vo) {
        return menuService.insertMenu(vo);
    }

}
