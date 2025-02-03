package com.cykj.mapper;

import com.cykj.DO.ParamItem;
import com.cykj.VO.InsertParamItemVO;
import com.cykj.VO.QueryParamItemVO;
import com.cykj.VO.UpdateParamItemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/20 下午9:29
 */
@Mapper
public interface ParamItemMapper {

    List<ParamItem> queryParamItem(QueryParamItemVO vo);

    Integer updateParamItemById(UpdateParamItemVO vo);

    Integer insertParamItem(InsertParamItemVO vo);

}
