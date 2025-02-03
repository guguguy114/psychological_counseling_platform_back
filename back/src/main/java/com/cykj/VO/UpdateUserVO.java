package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午6:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserVO {
    private Long userId;
    private Long userIsDelete;
    private Long userStatus;
    private String userPassword;
}
