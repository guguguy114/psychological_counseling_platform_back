package com.cykj.VO;

import com.cykj.DO.Consultant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/18 下午4:27
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertAdminVO {
    private Long adminId;
    private String adminName;
    private String adminPassword;
    private String adminAccount;
    private Long adminStatus;
    private Long adminRoleId;

    private Consultant consultant;
}
