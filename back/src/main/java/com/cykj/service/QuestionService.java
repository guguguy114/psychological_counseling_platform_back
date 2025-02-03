package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertQuestionVO;
import com.cykj.VO.QueryQuestionVO;
import com.cykj.VO.UpdateQuestionVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/24 上午12:16
 */
public interface QuestionService {

    ResponseDTO getQuestionById(QueryQuestionVO vo);

    ResponseDTO getQuestionByField(QueryQuestionVO vo);

    ResponseDTO insertQuestion(InsertQuestionVO vo);

    ResponseDTO updateQuestionById(UpdateQuestionVO vo);
}
