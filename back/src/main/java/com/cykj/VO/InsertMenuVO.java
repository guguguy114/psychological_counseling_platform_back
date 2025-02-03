package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/21 下午7:13
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertMenuVO {
    private String menuName;
    private String menuUrl;
    private Long menuParentId;
    private Long menuOrder;
}
