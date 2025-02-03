package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/3 下午3:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryFundFlowVO {

    private Long userId;
    private Integer startPage;
    private Integer pageSize;

}
