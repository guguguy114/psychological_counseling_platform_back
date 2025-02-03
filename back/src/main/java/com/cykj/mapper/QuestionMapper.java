package com.cykj.mapper;

import com.cykj.DO.Question;
import com.cykj.VO.InsertQuestionVO;
import com.cykj.VO.QueryQuestionVO;
import com.cykj.VO.UpdateQuestionVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/23 下午11:59
 */
@Mapper
public interface QuestionMapper {

    List<Question> queryQuestionByFieldId(QueryQuestionVO vo);

    Question queryQuestionById(QueryQuestionVO vo);

    Integer insertQuestion(InsertQuestionVO vo);

    Integer updateQuestionById(UpdateQuestionVO vo);

}
