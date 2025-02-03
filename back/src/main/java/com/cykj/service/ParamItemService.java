package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertParamItemVO;
import com.cykj.VO.QueryParamItemVO;
import com.cykj.VO.UpdateParamItemVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/20 下午9:29
 */
public interface ParamItemService {

    ResponseDTO getParamItem(QueryParamItemVO vo);

    ResponseDTO updateParamItemById(UpdateParamItemVO vo);

    ResponseDTO insertParamItem(InsertParamItemVO vo);
}
