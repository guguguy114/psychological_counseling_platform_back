package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryParamVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午5:02
 */
public interface ParamService {

    ResponseDTO getParamById(QueryParamVO vo);

    ResponseDTO getAll();
}
