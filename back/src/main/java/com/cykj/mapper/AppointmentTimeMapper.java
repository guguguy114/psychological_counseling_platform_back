package com.cykj.mapper;

import com.cykj.DO.AppointmentTime;
import com.cykj.VO.InsertAppointmentTimeVO;
import com.cykj.VO.QueryAppointmentTimeVO;
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
    Integer insertAppointmentTime(InsertAppointmentTimeVO vo);

    List<AppointmentTime> verifyTheOverlappingTimePeriods(InsertAppointmentTimeVO vo);

    List<AppointmentTime> queryAppointmentTimeByCourseId(QueryAppointmentTimeVO vo);
}
