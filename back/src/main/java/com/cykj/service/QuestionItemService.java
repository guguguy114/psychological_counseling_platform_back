package com.cykj.service;

import com.cykj.DO.QuestionItem;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertQuestionItemVO;
import com.cykj.VO.UpdateQuestionItemVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/27 下午5:05
 */
public interface QuestionItemService {

    ResponseDTO insertQuestionItem(InsertQuestionItemVO vo);

    ResponseDTO updateQuestionItemById(UpdateQuestionItemVO vo);
}
