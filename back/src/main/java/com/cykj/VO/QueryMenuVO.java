package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/8 下午5:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryMenuVO {
    private Long menuId;
    private Long roleId;
    private Long adminId;
    private String menuName;
    private Long menuParentId;
    private Integer startPage;
    private Integer pageSize;
}
