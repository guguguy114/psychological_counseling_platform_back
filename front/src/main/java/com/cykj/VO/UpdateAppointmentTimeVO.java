package com.cykj.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/12 上午12:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateAppointmentTimeVO {
    private Long appointmentTimeId;
    private Long userId;
}
