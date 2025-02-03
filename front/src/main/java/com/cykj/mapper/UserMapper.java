package com.cykj.mapper;

import com.cykj.DO.User;
import com.cykj.VO.InsertFundFlowVO;
import com.cykj.VO.InsertUserVO;
import com.cykj.VO.QueryUserVO;
import com.cykj.VO.UpdateUserVO;
import org.apache.ibatis.annotations.Mapper;

import java.math.BigDecimal;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午4:33
 */
@Mapper
public interface UserMapper {

    User login(QueryUserVO vo);

    Integer insertUser(InsertUserVO vo);

    BigDecimal getUserBalance(QueryUserVO vo);

    Integer charge(UpdateUserVO vo);

    Integer updateBalance(InsertFundFlowVO vo);
}
