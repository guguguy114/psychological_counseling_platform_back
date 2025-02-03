package com.cykj.service.impl;

import com.cykj.DO.FundFlow;
import com.cykj.DO.Menu;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryFundFlowVO;
import com.cykj.mapper.FundFlowMapper;
import com.cykj.service.FundFlowService;
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
 * @since 2025/2/3 下午3:55
 */
@Service
public class FundFlowServiceImpl implements FundFlowService {

    private final FundFlowMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private FundFlowServiceImpl(FundFlowMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO queryFundFlowByUserId(QueryFundFlowVO vo) {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<FundFlow> list = mapper.queryFundFlowByUserId(vo);
        PageInfo<FundFlow> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }
}
