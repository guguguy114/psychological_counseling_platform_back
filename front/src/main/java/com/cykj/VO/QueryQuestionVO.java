package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/23 下午11:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class QueryQuestionVO {
    private Long questionId;
    private Long fieldId;
    private Integer startPage;
    private Integer pageSize;
}
