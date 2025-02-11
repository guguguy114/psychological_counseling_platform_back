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
 * @since 2025/2/12 上午12:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertAppointmentVO {
    private Long userId;
    private Long consultantId;
    private Long fieldId;
    private Long appointmentTimeId;
    private String appointmentDetail;
    private Long appointmentStatus;
    private BigDecimal appointmentPrice;
}
