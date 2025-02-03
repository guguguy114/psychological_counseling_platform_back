package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/18 下午2:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAdminVO {
    private Long adminId;
    private Long adminIsDelete;
    private Long adminStatus;
    private String adminPassword;
}
