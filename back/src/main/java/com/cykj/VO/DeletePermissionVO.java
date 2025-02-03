package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/23 上午1:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DeletePermissionVO {
    private Long roleId;
    private List<Long> menuIdList;
}
