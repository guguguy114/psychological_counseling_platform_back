package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryAssessmentRecordVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/4 上午12:06
 */
public interface AssessmentRecordService {
    ResponseDTO queryAssessmentRecordByDatetimeAndScore(QueryAssessmentRecordVO vo);
}
