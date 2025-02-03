package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/27 下午5:52
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateQuestionVO {
    private Long questionId;
    private String questionTitle;
    private Long questionOrder;
    private Long questionIsDelete;
}
