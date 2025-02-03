package com.cykj.mapper;

import com.cykj.DO.Question;
import com.cykj.VO.QueryQuestionVO;
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

}
