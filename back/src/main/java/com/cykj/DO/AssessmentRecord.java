package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssessmentRecord {

  private Long assessmentRecordId;
  private Long userId;
  private String userName;
  private Long fieldId;
  private String fieldName;
  private Long assessmentScore;
  private Long assessmentResult;
  private String assessmentReport;
  private LocalDateTime assessmentTime;
}
