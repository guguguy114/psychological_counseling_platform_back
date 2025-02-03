package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/21 下午12:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertParamItemVO {
    private Long paramId;
    private String paramItemName;
    private Long paramItemValue;
}
