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
 * @since 2025/2/4 上午12:01
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertAssessmentRecordVO {
    private Long userId;
    private Long fieldId;
    private Long assessmentScore;
    private Long assessmentResult;
    private String assessmentReport;
    private BigDecimal price;
}
