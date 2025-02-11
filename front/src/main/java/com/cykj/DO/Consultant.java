package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consultant {
  private Long consultantId;
  private Long consultantAdminId;
  private Long consultantFieldId;
  private String consultantTitle;
  private String consultantCollege;
  private String consultantBackground;
  private String consultantBrief;
  private BigDecimal consultantPrice;

  private String fieldName;
  private String adminName;

}
