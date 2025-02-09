package com.cykj.mapper;

import com.cykj.DO.FundFlow;
import com.cykj.VO.QueryFundFlowVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/3 下午3:52
 */
@Mapper
public interface FundFlowMapper {
    List<FundFlow> queryFundFlowByAdminId(QueryFundFlowVO vo);
}
