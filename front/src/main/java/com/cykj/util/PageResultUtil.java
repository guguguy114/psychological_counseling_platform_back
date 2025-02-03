package com.cykj.util;

import com.github.pagehelper.PageInfo;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2024/12/2 下午4:55
 */
public class PageResultUtil {

    private PageResultUtil() {

    }

    public static PageInfoResult getResult(PageInfo<?> pageInfo) {
        PageInfoResult result = new PageInfoResult();
        result.setPageNum(pageInfo.getPageNum());
        result.setPages(pageInfo.getPages());
        result.setTotal(pageInfo.getTotal());
        result.setList(pageInfo.getList());
        return result;
    }

}
