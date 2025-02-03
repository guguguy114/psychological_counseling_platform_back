package com.cykj.DO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Menu {

  private Long menuId;
  private String menuName;
  private String menuComponent;
  private String menuUrl;
  private String menuIcon;
  private Long menuStatus;
  private Long menuParentId;
  private Long menuOrder;
  private LocalDateTime menuCreateTime;
  private LocalDateTime menuUpdateTime;

  private List<Menu> childrenMenu = new ArrayList<>();
}
