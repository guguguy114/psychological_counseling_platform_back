package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/20 下午10:30
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateParamItemVO {
    private Long paramItemId;
    private String paramItemName;
    private Long paramItemValue;
    private Long paramId;
    private Long paramItemIsDelete;
}
