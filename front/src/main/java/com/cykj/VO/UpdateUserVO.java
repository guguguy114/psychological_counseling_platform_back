package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/3 下午6:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateUserVO {
    private Long userId;
    private BigDecimal chargeMoney;
}
