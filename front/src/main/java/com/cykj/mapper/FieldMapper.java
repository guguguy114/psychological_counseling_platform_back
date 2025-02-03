package com.cykj.mapper;

import com.cykj.DO.Field;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/18 下午5:02
 */
@Mapper
public interface FieldMapper {

    List<Field> queryAllField();

}
