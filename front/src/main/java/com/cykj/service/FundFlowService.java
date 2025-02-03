package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryFundFlowVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/3 下午3:54
 */
public interface FundFlowService {
    ResponseDTO queryFundFlowByUserId(QueryFundFlowVO vo);
}
