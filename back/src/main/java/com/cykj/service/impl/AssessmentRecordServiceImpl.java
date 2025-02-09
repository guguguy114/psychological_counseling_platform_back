package com.cykj.service.impl;

import com.cykj.DO.AssessmentRecord;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryAssessmentRecordVO;
import com.cykj.mapper.AssessmentRecordMapper;
import com.cykj.service.AssessmentRecordService;
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
 * @since 2025/2/4 上午12:07
 */
@Service
public class AssessmentRecordServiceImpl implements AssessmentRecordService {

    private final AssessmentRecordMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private AssessmentRecordServiceImpl(AssessmentRecordMapper mapper)  {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO queryAssessmentRecordByDatetimeAndScore(QueryAssessmentRecordVO vo) {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<AssessmentRecord> list = mapper.queryAssessmentRecordByDatetimeAndScore(vo);
        PageInfo<AssessmentRecord> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }
}
