package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Question {

  private Long questionId;
  private String questionTitle;
  private Long fieldId;
  private Long questionOrder;

  List<QuestionItem> questionItems = new ArrayList<>();

}
