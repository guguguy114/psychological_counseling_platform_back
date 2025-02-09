package com.cykj.VO;

import com.fasterxml.jackson.annotation.JsonFormat;
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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime startTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime endTime;
    private Long appointmentStatus;
    private Long consultantId;
    private String consultantName;
    private String userName;
    private Integer startPage;
    private Integer pageSize;

}
