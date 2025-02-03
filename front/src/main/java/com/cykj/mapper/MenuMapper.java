package com.cykj.mapper;

import com.cykj.DO.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 上午11:33
 */
@Mapper
public interface MenuMapper {
    List<Menu> queryMenu();
}
