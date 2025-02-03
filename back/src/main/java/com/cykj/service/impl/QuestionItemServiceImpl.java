package com.cykj.service.impl;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertQuestionItemVO;
import com.cykj.VO.UpdateQuestionItemVO;
import com.cykj.mapper.QuestionItemMapper;
import com.cykj.service.QuestionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/27 下午5:06
 */
@Service
public class QuestionItemServiceImpl implements QuestionItemService {

    private final QuestionItemMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private QuestionItemServiceImpl(QuestionItemMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    public ResponseDTO insertQuestionItem(InsertQuestionItemVO vo) {
        Integer result = mapper.insertQuestionItem(vo);
        if (result == 1) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error(result);
        }
        return dto;
    }

    @Override
    public ResponseDTO updateQuestionItemById(UpdateQuestionItemVO vo) {
        Integer result = mapper.updateQuestionItemById(vo);
        if (result == 1) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error(result);
        }
        return dto;
    }
}
