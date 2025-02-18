package com.cykj.mapper;

import com.cykj.DO.AppointmentTime;
import com.cykj.VO.QueryAppointmentTimeVO;
import com.cykj.VO.UpdateAppointmentTimeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/2/5 下午11:09
 */
@Mapper
public interface AppointmentTimeMapper {
    List<AppointmentTime> queryAppointmentTimeByCourseId(QueryAppointmentTimeVO vo);

    Integer updateAppointmentTimeById(UpdateAppointmentTimeVO vo);
}
