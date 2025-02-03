package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryParamVO;
import com.cykj.service.ParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午5:01
 */
@RestController
@RequestMapping("param")
public class ParamController {

    private ParamService paramService;

    @Autowired
    private ParamController(ParamService paramService) {
        this.paramService = paramService;
    }

    @RequestMapping("get_param_by_id")
    public ResponseDTO getParamById(@RequestBody QueryParamVO vo) {
        return paramService.getParamById(vo);
    }

    @RequestMapping("get_all")
    public ResponseDTO getAllParam() {
        return paramService.getAll();
    }

}
