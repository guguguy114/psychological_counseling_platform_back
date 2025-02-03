package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/18 下午4:59
 */
@RestController
@RequestMapping("field")
public class FieldController {

    private FieldService fieldService;

    @Autowired
    private FieldController(FieldService fieldService) {
        this.fieldService = fieldService;
    }

    @RequestMapping("get_all")
    public ResponseDTO getAllField() {
        return fieldService.getAll();
    }

}
