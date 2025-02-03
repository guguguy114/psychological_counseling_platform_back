package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/21 下午2:56
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateMenuVO {
    private Long menuId;
    private String menuName;
    private String menuUrl;
    private String menuIcon;
    private Long menuIsDelete;
    private Long menuParentId;
    private Long menuOrder;
    private Long menuStatus;
}
