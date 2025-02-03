package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertQuestionItemVO;
import com.cykj.VO.UpdateQuestionItemVO;
import com.cykj.service.QuestionItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/26 下午9:20
 */
@RestController
@RequestMapping("question_item")
public class QuestionItemController {

    private final QuestionItemService questionItemService;

    @Autowired
    private QuestionItemController(QuestionItemService questionItemService) {
        this.questionItemService = questionItemService;
    }

    @RequestMapping("insert_question_item")
    public ResponseDTO insertQuestionItem(@RequestBody InsertQuestionItemVO vo) {
        return questionItemService.insertQuestionItem(vo);
    }

    @RequestMapping("update_question_item_by_id")
    public ResponseDTO updateQuestionItemById(@RequestBody UpdateQuestionItemVO vo) {
        return questionItemService.updateQuestionItemById(vo);
    }
    
}
