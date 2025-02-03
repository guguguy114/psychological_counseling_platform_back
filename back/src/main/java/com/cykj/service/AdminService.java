package com.cykj.service;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertAdminVO;
import com.cykj.VO.QueryAdminVO;
import com.cykj.VO.UpdateAdminVO;

import javax.servlet.http.HttpSession;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午9:38
 */
public interface AdminService {

    ResponseDTO login(QueryAdminVO vo);

    ResponseDTO getAdmin(QueryAdminVO vo);

    ResponseDTO updateAdminById(UpdateAdminVO vo);

    ResponseDTO insertAdmin(InsertAdminVO vo);

}
