package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryQuestionVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/24 上午12:16
 */
public interface QuestionService {


    ResponseDTO getQuestionByField(QueryQuestionVO vo);


}
