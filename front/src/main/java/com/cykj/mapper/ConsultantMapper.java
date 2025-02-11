package com.cykj.mapper;

import com.cykj.DO.Consultant;
import com.cykj.VO.QueryConsultantVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/18 下午2:03
 */
@Mapper
public interface ConsultantMapper {

    Consultant getConsultantById(QueryConsultantVO vo);

    List<Consultant> getConsultantByFieldId(QueryConsultantVO vo);
}
