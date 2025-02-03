package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public ResponseDTO getMenu() {
        return menuService.getMenu();
    }

}
