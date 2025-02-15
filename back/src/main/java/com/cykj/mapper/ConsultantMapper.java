package com.cykj.mapper;

import com.cykj.DO.Consultant;
import com.cykj.VO.InsertFundFlowVO;
import com.cykj.VO.QueryConsultantVO;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;
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

    Integer insertConsultant(Consultant consultant);

    BigDecimal getBalance(QueryConsultantVO vo);

    Consultant getConsultantByAdminId(QueryConsultantVO vo);

    Integer updateBalance(InsertFundFlowVO vo);

    List<Consultant> getAll();
}
