package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {

  private Long appointmentId;
  private Long consultantId;
  private Long userId;
  private Long fieldId;
  private Long appointmentTimeId;
  private Long appointmentStatus;
  private BigDecimal appointmentPrice;
  private String appointmentDetail;
  private String appointmentReply;
  private LocalDateTime appointmentReplyTime;
  private String appointmentComment;

  private LocalDateTime appointmentStartTime;
  private LocalDateTime appointmentEndTime;
  private String adminName;
  private String userName;
  private String fieldName;
}
