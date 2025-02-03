package com.cykj.VO;

import com.cykj.util.PageResultUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/4 上午1:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryAssessmentRecordVO {
    private Long userId;
    private Integer startPage;
    private Integer pageSize;
}
