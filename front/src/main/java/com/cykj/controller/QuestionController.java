package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryQuestionVO;
import com.cykj.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/23 下午11:58
 */
@RestController
@RequestMapping("question")
public class QuestionController {

    private final QuestionService questionService;

    @Autowired
    public QuestionController(QuestionService questionService) {
        this.questionService = questionService;
    }


    @RequestMapping("get_question_by_field")
    public ResponseDTO getQuestionByField(@RequestBody QueryQuestionVO vo) {
        return questionService.getQuestionByField(vo);
    }



}
