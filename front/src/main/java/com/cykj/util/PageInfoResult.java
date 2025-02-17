package com.cykj.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @BelongsProject: ecard-back
 * @BelongsPackage: org.wql.util
 * @Author: 阿隆
 * @CreateTime: 2024-10-28 19:31
 * @Description: pagehelper分页插件对应PageInfo数据
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageInfoResult {
    //当前页
    private int pageNum;
    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    private List<?> list;

/*
    //当前页
    private int pageNum;
    //每页的数量
    private int pageSize;
    //当前页的数量
    private int size;
    //当前页面第一个元素在数据库中的行号
    private int startRow;
    //当前页面最后一个元素在数据库中的行号
    private int endRow;
    //总记录数
    private long total;
    //总页数
    private int pages;
    //结果集
    private List<?> list;
    //前一页
    private int prePage;
    //下一页
    private int nextPage;
    //是否为第一页
    private boolean isFirstPage;
    //是否为最后一页
    private boolean isLastPage;
    //是否有前一页
    private boolean hasPreviousPage;
    //是否有下一页
    private boolean hasNextPage;
    //导航页码数
    private int navigatePages;
    //所有导航页号
    private int[] navigatepageNums;
    //导航条上的第一页
    private int navigateFirstPage;
    //导航条上的最后一页
    private int navigateLastPage;
*/
}