package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.InsertAssessmentRecordVO;
import com.cykj.VO.QueryAssessmentRecordVO;
import com.cykj.service.AssessmentRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/3 下午11:59
 */
@RestController
@RequestMapping("/assessment_record")
public class AssessmentRecordController {

    private final AssessmentRecordService assessmentRecordService;

    @Autowired
    private AssessmentRecordController(AssessmentRecordService assessmentRecordService) {
        this.assessmentRecordService = assessmentRecordService;
    }

    @RequestMapping("/submit")
    public ResponseDTO insertAssessmentRecord(@RequestBody InsertAssessmentRecordVO vo)  {
        return assessmentRecordService.insertAssessmentRecord(vo);
    }

    @RequestMapping("/get_assessment_record_by_user")
    public ResponseDTO queryAssessmentRecordByUserId(@RequestBody QueryAssessmentRecordVO vo)  {
        return assessmentRecordService.queryAssessmentRecordByUserId(vo);
    }

}
