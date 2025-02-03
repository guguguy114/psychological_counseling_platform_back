package com.cykj.service.impl;

import com.cykj.DO.Question;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertQuestionVO;
import com.cykj.VO.QueryQuestionVO;
import com.cykj.VO.UpdateQuestionVO;
import com.cykj.mapper.QuestionMapper;
import com.cykj.service.QuestionService;
import com.cykj.util.PageInfoResult;
import com.cykj.util.PageResultUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
    public ResponseDTO getQuestionById(QueryQuestionVO vo) {
        Question question = mapper.queryQuestionById(vo);
        if (question != null) {
            dto = ResponseDTO.success(question);
        } else {
            dto = ResponseDTO.error("no such question");
        }
        return dto;
    }

    @Override
    public ResponseDTO getQuestionByField(QueryQuestionVO vo) {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<Question> list = mapper.queryQuestionByFieldId(vo);
        PageInfo<Question> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }

    @Override
    public ResponseDTO insertQuestion(InsertQuestionVO vo) {
        Integer res = mapper.insertQuestion(vo);
        if (res > 0) {
            dto = ResponseDTO.success(res);
        } else {
            dto = ResponseDTO.error("insert question failed");
        }
        return dto;
    }

    @Override
    public ResponseDTO updateQuestionById(UpdateQuestionVO vo) {
        Integer res = mapper.updateQuestionById(vo);
        if (res > 0) {
            dto = ResponseDTO.success(res);
        } else {
            dto = ResponseDTO.error("update question failed");
        }
        return dto;
    }
}
