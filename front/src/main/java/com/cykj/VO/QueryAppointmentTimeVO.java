package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/6 下午3:44
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryAppointmentTimeVO {
    private Long consultantId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
}
