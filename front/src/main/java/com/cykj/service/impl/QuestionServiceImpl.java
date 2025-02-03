package com.cykj.service.impl;

import com.cykj.DO.Question;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryQuestionVO;
import com.cykj.mapper.QuestionMapper;
import com.cykj.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/24 上午12:17
 */
@Service
public class QuestionServiceImpl implements QuestionService {

    private final QuestionMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private QuestionServiceImpl(QuestionMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    public ResponseDTO getQuestionByField(QueryQuestionVO vo) {
        List<Question> list = mapper.queryQuestionByFieldId(vo);
        return ResponseDTO.success(list);
    }


}
