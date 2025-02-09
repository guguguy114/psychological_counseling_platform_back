package com.cykj.service.impl;

import com.cykj.DO.Admin;
import com.cykj.DO.Consultant;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertAdminVO;
import com.cykj.VO.QueryAdminVO;
import com.cykj.VO.QueryConsultantVO;
import com.cykj.VO.UpdateAdminVO;
import com.cykj.mapper.AdminMapper;
import com.cykj.mapper.ConsultantMapper;
import com.cykj.service.AdminService;
import com.cykj.util.JwtUtils;
import com.cykj.util.PageInfoResult;
import com.cykj.util.PageResultUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午9:40
 */
@Service
public class AdminServiceImpl implements AdminService {

    private final AdminMapper mapper;

    private final ConsultantMapper consultantMapper;

    private ResponseDTO dto;

    private AdminServiceImpl(AdminMapper mapper, ConsultantMapper consultantMapper) {
        this.mapper = mapper;
        this.consultantMapper = consultantMapper;
    }

    public ResponseDTO login(QueryAdminVO vo) {
            Admin admin = mapper.login(vo);
            if (admin != null) {
                HashMap<String, Object> map = new HashMap<>();
                if (admin.getRole().getRoleId() == 2) {
                    QueryConsultantVO cvo = new QueryConsultantVO();
                    cvo.setAdminId(admin.getAdminId());
                    Consultant consultant = consultantMapper.getConsultantByAdminId(cvo);
                    map.put("consultantId", consultant.getConsultantId());
                }
                map.put("adminId", admin.getAdminId());
                map.put("roleId", admin.getRole().getRoleId());
                map.put("name", admin.getAdminName());
                map.put("roleName", admin.getRole().getRoleName());
                String token = JwtUtils.generateJwt(map);
                dto = ResponseDTO.success(token);
            } else {
                dto = ResponseDTO.error("no admin found");
            }
        return dto;
    }

    @Override
    public ResponseDTO getAdmin(QueryAdminVO vo) {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<Admin> list = mapper.queryAdmin(vo);
        PageInfo<Admin> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }

    @Override
    public ResponseDTO updateAdminById(UpdateAdminVO vo) {
        Integer result = mapper.updateAdminById(vo);
        if (result == 1) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error("update admin failed");
        }
        return dto;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseDTO insertAdmin(InsertAdminVO vo) {
        Integer result1 = mapper.insertAdmin(vo);
        if (!(vo.getConsultant() == null)) {
            vo.getConsultant().setConsultantAdminId(vo.getAdminId());
            Integer result2 = consultantMapper.insertConsultant(vo.getConsultant());
        }
        dto = ResponseDTO.success("insert admin success");
        return dto;
    }
}
