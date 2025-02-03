package com.cykj.service.impl;

import com.cykj.DO.Admin;
import com.cykj.DO.ParamItem;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertParamItemVO;
import com.cykj.VO.QueryParamItemVO;
import com.cykj.VO.UpdateParamItemVO;
import com.cykj.mapper.ParamItemMapper;
import com.cykj.service.ParamItemService;
import com.cykj.util.PageInfoResult;
import com.cykj.util.PageResultUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/20 下午9:30
 */
@Service
public class ParamItemServiceImpl implements ParamItemService {

    private final ParamItemMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private ParamItemServiceImpl(ParamItemMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getParamItem(QueryParamItemVO vo) {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<ParamItem> list = mapper.queryParamItem(vo);
        PageInfo<ParamItem> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }

    @Override
    public ResponseDTO updateParamItemById(UpdateParamItemVO vo) {
        System.out.println(vo);
        Integer result = mapper.updateParamItemById(vo);
        if (result == 1) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error(null);
        }
        return dto;
    }

    @Override
    public ResponseDTO insertParamItem(InsertParamItemVO vo) {
        Integer result = mapper.insertParamItem(vo);
        if (result == 1) {
            dto = ResponseDTO.success(result);
        } else {
            dto = ResponseDTO.error(null);
        }
        return dto;
    }
}
