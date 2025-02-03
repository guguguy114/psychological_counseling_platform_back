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
public class QueryAdminVO {
    private Long adminId;
    private String adminName;
    private Long adminStatus;
    private String adminAccount;
    private String adminPassword;
    private Integer adminIsDelete;
    private String consultantTitle;
    private Integer startPage;
    private Integer pageSize;
    private String code;
    private String token;
}
