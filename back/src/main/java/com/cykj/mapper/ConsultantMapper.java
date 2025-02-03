package com.cykj.mapper;

import com.cykj.DO.Consultant;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/18 下午2:03
 */
@Mapper
public interface ConsultantMapper {

    Integer insertConsultant(Consultant consultant);

}
