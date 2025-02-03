package com.cykj.service.impl;

import com.cykj.DO.Param;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryParamVO;
import com.cykj.mapper.ParamMapper;
import com.cykj.service.ParamService;
import org.springframework.stereotype.Service;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午5:02
 */
@Service
public class ParamServiceImpl implements ParamService {

    private final ParamMapper mapper;

    private ResponseDTO dto;

    private ParamServiceImpl(ParamMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getParamById(QueryParamVO vo) {
        Param param = mapper.queryParamById(vo);
        if (param != null) {
            dto = ResponseDTO.success(param);
        } else {
            dto = ResponseDTO.error("no param found");
        }
        return dto;
    }

}
