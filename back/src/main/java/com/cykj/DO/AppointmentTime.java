package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AppointmentTime {

  private Long appointmentTimeId;
  private Long userId;
  private Long consultantId;
  private LocalDateTime appointmentStartTime;
  private LocalDateTime appointmentEndTime;
  private Long appointmentTimeIsDelete;

  private String userName;

}
