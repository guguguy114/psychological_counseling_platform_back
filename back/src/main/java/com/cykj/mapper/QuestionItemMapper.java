package com.cykj.mapper;

import com.cykj.VO.InsertQuestionItemVO;
import com.cykj.VO.UpdateQuestionItemVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/27 下午5:01
 */
@Mapper
public interface QuestionItemMapper {

    Integer insertQuestionItem(InsertQuestionItemVO vo);

    Integer updateQuestionItemById(UpdateQuestionItemVO vo);

}
