package com.cykj.mapper;

import com.cykj.DO.AssessmentRecord;
import com.cykj.VO.QueryAssessmentRecordVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/4 上午12:00
 */
@Mapper
public interface AssessmentRecordMapper {

    List<AssessmentRecord> queryAssessmentRecordByDatetimeAndScore(QueryAssessmentRecordVO vo);

}
