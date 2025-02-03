package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
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

    ResponseDTO getUserByNameAndStatus(QueryUserVO vo);

    ResponseDTO updateUserById(UpdateUserVO vo);

}
