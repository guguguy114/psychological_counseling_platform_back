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
 * @since 2025/2/6 下午11:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAppointmentVO {

    private Long appointmentId;
    private Long appointmentStatus;
    private String appointmentReply;
    private String appointmentComment;
    private LocalDateTime appointmentReplyTime;
    private LocalDateTime appointmentCommentTime;

}
