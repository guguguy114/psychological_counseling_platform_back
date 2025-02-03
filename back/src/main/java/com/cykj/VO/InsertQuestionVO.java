package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/25 下午11:10
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class InsertQuestionVO {

    private Long fieldId;
    private String questionTitle;
    private Long questionOrder;


}
