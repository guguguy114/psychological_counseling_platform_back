package com.cykj.DO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class QuestionItem {

  private Long questionItemId;
  private Long questionId;
  private String questionItemName;
  private Long questionItemOrder;
  private Long questionItemIsDelete;
  private Long questionItemScore;
}
