package com.cykj.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2024/10/24 上午10:31
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private Integer code;
    private String msg;
    private Object data;

    public static ResponseDTO success(Object data) {
        return new ResponseDTO(200, "success", data);
    }

    public static ResponseDTO error(Object data) {
        return new ResponseDTO(500, "error", data);
    }
}
