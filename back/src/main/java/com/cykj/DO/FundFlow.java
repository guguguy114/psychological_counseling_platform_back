package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FundFlow {

  private Long fundFlowId;
  private Long userId;
  private Long consultantId;
  private Long fundFlowType;
  private Long fundFlowEvent;
  private Double fundFlow;
  private LocalDateTime fundFlowTime;
  private String adminName;
  private String userName;
}
