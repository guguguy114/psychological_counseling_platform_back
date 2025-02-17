package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

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
    private Long userId;
    private String userName;
    private Long userStatus;
    private Integer userIsDelete;
    private Integer startPage;
    private Integer pageSize;
    private LocalDateTime[] startTimes;
    private LocalDateTime[] endTimes;
}
