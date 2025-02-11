package com.cykj.mapper;

import com.cykj.DO.User;
import com.cykj.VO.InsertFundFlowVO;
import com.cykj.VO.QueryUserVO;
import com.cykj.VO.UpdateUserVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午4:33
 */
@Mapper
public interface UserMapper {
    List<User> queryUserByNameAndStatus(QueryUserVO vo);

    Integer updateUserById(UpdateUserVO vo);

    Integer getUserCountByDateRange(@Param("startTime") LocalDateTime startTime, @Param("endTime") LocalDateTime endTime);

    Integer updateBalance(InsertFundFlowVO vo);

    BigDecimal getUserBalance(QueryUserVO vo);
}
