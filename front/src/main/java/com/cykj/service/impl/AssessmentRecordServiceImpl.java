package com.cykj.service.impl;

import com.cykj.DO.AssessmentRecord;
import com.cykj.DO.FundFlow;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertAssessmentRecordVO;
import com.cykj.VO.InsertFundFlowVO;
import com.cykj.VO.QueryAssessmentRecordVO;
import com.cykj.mapper.AssessmentRecordMapper;
import com.cykj.service.AssessmentRecordService;
import com.cykj.service.UserService;
import com.cykj.util.PageInfoResult;
import com.cykj.util.PageResultUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    private final UserService userService;

    private ResponseDTO dto;

    @Autowired
    private AssessmentRecordServiceImpl(AssessmentRecordMapper mapper, UserService userService)  {
        this.userService = userService;
        this.mapper = mapper;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public ResponseDTO insertAssessmentRecord(InsertAssessmentRecordVO vo) {
        Integer result = mapper.insertAssessmentRecord(vo);
        if (result == 1) {
            dto = userService.updateUserBalance(new InsertFundFlowVO(vo.getUserId(), null, 0L, 3L, vo.getPrice()));
        } else {
            dto = ResponseDTO.error("insert record failed");
        }
        return dto;
    }

    @Override
    public ResponseDTO queryAssessmentRecordByUserId(QueryAssessmentRecordVO vo) {
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<AssessmentRecord> list = mapper.queryAssessmentRecordByUserId(vo);
        PageInfo<AssessmentRecord> pageInfo = new PageInfo<>(list);
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        return ResponseDTO.success(result);
    }
}
