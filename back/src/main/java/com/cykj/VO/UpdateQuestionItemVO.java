package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/26 下午9:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateQuestionItemVO {
    private Long questionItemId;
    private Long questionId;
    private String questionItemName;
    private Long questionItemOrder;
    private Long questionItemScore;
    private Long questionItemIsDelete;
}
