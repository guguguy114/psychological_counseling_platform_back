package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertParamItemVO;
import com.cykj.VO.QueryParamItemVO;
import com.cykj.VO.UpdateParamItemVO;
import com.cykj.service.ParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/20 下午9:28
 */
@RestController
@RequestMapping("param_item")
public class ParamItemController {

    private final ParamItemService paramItemService;

    @Autowired
    private ParamItemController(ParamItemService paramItemService) {
        this.paramItemService = paramItemService;
    }

    @RequestMapping("get_param_item")
    public ResponseDTO getParamItem(@RequestBody QueryParamItemVO vo) {
        return paramItemService.getParamItem(vo);
    }

    @RequestMapping("update_param_item_by_id")
    public ResponseDTO updateParamItemById(@RequestBody UpdateParamItemVO vo) {
        return paramItemService.updateParamItemById(vo);
    }

    @RequestMapping("insert_param_item")
    public ResponseDTO insertParamItem(@RequestBody InsertParamItemVO vo) {
        return paramItemService.insertParamItem(vo);
    }

}
