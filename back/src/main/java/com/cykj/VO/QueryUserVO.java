package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午5:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryUserVO {
    private String userName;
    private String userStatus;
    private Integer userIsDelete;
    private Integer startPage;
    private Integer pageSize;
}
