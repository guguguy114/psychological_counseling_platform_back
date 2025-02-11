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
 * @since 2025/2/6 下午10:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryAppointmentVO {

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long appointmentStatus;
    private Long userId;
    private Long consultantId;
    private Integer startPage;
    private Integer pageSize;

}
