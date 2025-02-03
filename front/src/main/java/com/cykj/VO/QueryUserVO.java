package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午9:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryUserVO {
    private Long userId;
    private String userAccount;
    private String userPassword;
    private String code;
    private String token;
}
