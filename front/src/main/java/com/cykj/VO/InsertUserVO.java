package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/3 上午1:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertUserVO {
    private String account;
    private String password;
    private String username;
    private Long age;
    private Long sex;
    private String phone;
    private String address;
    private String code;
}
