package com.cykj.controller;

import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryFundFlowVO;
import com.cykj.service.FundFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/3 下午3:57
 */
@RestController
@RequestMapping("fund_flow")
public class FundFlowController {

    private FundFlowService fundFlowService;

    @Autowired
    private FundFlowController(FundFlowService fundFlowService) {
        this.fundFlowService = fundFlowService;
    }

    @RequestMapping("get_consultant_fund_flow_by_admin_id")
    public ResponseDTO getConsultantFundFlowByAdminId(@RequestBody QueryFundFlowVO vo)  {
        return fundFlowService.getFundFlowByAdminId(vo);
    }

}
