package com.cykj.service.impl;

import com.cykj.DO.User;
import com.cykj.DTO.ResponseDTO;
import com.cykj.VO.QueryUserVO;
import com.cykj.VO.UpdateUserVO;
import com.cykj.mapper.UserMapper;
import com.cykj.service.UserService;
import com.cykj.util.PageInfoResult;
import com.cykj.util.PageResultUtil;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/17 下午4:33
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserMapper mapper;

    ResponseDTO dto;

    @Autowired
    private UserServiceImpl(UserMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getUserByNameAndStatus(QueryUserVO vo) {



        // 拦截
        // 设置
        Page<Object> objectPage = PageHelper.startPage(vo.getStartPage(), vo.getPageSize());
        List<User> list = mapper.queryUserByNameAndStatus(vo);
        // 这里pageInfo就是具体分页，将全体查询对象传给插件
        PageInfo<User> pageInfo = new PageInfo<>(list);
        // 组装数据，仅挑选需要的数据
        PageInfoResult result = PageResultUtil.getResult(pageInfo);
        objectPage.close();
        // 将分页传出去
        return ResponseDTO.success(result);

    }

    @Override
    public ResponseDTO updateUserById(UpdateUserVO vo) {
        Integer result = mapper.updateUserById(vo);
        if (result == 1){
            dto = ResponseDTO.success("succeed");
        } else {
            dto = ResponseDTO.error("update failed");
        }
        return dto;
    }

    @Override
    public ResponseDTO getUserCountByDateRange(QueryUserVO vo) {
        Map<String, Object> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < vo.getStartTimes().length; i++)  {
            Integer result = mapper.getUserCountByDateRange(vo.getStartTimes()[i], vo.getEndTimes()[i]);
            res.add(result);
        }
        // 查询区间时间段
        map.put("list", res);
        // 查询时间段总数
        Integer total = mapper.getUserCountByDateRange(vo.getStartTimes()[0], vo.getEndTimes()[vo.getEndTimes().length - 1]);
        map.put("total", total);
        return ResponseDTO.success(map);
    }
}
