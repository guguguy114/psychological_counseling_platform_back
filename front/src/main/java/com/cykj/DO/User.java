package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
  private Long userId;
  private String userAccount;
  private String userPassword;
  private Long userRoleId;
  private String userName;
  private Long userSex;
  private Long userAge;
  private String userPhone;
  private String userAddress;
  private Long userStatus;
  private Long userIsDelete;
  private BigDecimal userBalance;
  private LocalDateTime userEnrollTime;
  private LocalDateTime userUpdateTime;
}
