package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryConsultantVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/5 下午3:03
 */
public interface ConsultantService {
    ResponseDTO getBalance(QueryConsultantVO vo);

    ResponseDTO getConsultantByAdminId(QueryConsultantVO vo);

    ResponseDTO getAll();
}
