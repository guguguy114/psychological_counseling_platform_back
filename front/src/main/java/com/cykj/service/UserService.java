package com.cykj.service;


import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertFundFlowVO;
import com.cykj.VO.InsertUserVO;
import com.cykj.VO.QueryUserVO;
import com.cykj.VO.UpdateUserVO;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午4:32
 */
public interface UserService {

    ResponseDTO login(QueryUserVO vo);

    ResponseDTO enroll(InsertUserVO vo);

    ResponseDTO getUserBalance(QueryUserVO vo);

    ResponseDTO charge(UpdateUserVO vo);

    ResponseDTO updateUserBalance(InsertFundFlowVO vo);
}
