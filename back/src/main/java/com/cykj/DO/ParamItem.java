package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ParamItem {

  private Long paramItemId;
  private String paramItemName;
  private Long paramItemValue;
  private Long paramId;
  private Long paramItemOrder;

  private Param param;

}
