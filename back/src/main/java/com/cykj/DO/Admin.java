package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin {

  private Long adminId;
  private Long adminRoleId;
  private String adminAccount;
  private String adminPassword;
  private String adminName;
  private String adminFace;
  private String adminStatus;
  private Long adminIsDelete;
  private LocalDateTime adminCreateTime;
  private LocalDateTime adminUpdateTime;

  private Role role;
  private Consultant consultant;
}
