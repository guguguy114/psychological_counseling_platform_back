package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/20 下午9:34
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryParamItemVO {
    private Long paramId;
    private String paramItemName;
    private Integer startPage;
    private Integer pageSize;

}
