package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/3 下午6:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertFundFlowVO {
    private Long userId;
    private Long consultantId;
    private Long fundFlowType;
    private Long fundFlowEvent;
    private BigDecimal fundFlow;
}
