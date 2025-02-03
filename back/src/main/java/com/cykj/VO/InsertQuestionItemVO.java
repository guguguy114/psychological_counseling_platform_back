package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/27 下午5:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertQuestionItemVO {
    private String questionItemName;
    private String questionItemOrder;
    private Long questionItemScore;
    private Long questionId;
}
