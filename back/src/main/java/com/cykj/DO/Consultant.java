package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Consultant {

  private Long consultantId;
  private Long consultantAdminId;
  private Long consultantFieldId;
  private String consultantTitle;
  private String consultantCollege;
}
