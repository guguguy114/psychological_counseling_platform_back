package com.cykj.mapper;

import com.cykj.DO.Param;
import com.cykj.VO.QueryParamVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午5:02
 */
@Mapper
public interface ParamMapper {

    Param queryParamById(QueryParamVO vo);

}
