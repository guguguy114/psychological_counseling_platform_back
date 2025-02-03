package com.cykj.service.impl;

import com.cykj.DO.Field;
import com.cykj.DTO.ResponseDTO;
import com.cykj.mapper.FieldMapper;
import com.cykj.service.FieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description: TODO
 *
 * @author Guguguy
 * @version 1.0
 * @since 2025/1/18 下午5:01
 */
@Service
public class FieldServiceImpl implements FieldService {

    private final FieldMapper mapper;

    private ResponseDTO dto;

    @Autowired
    private FieldServiceImpl(FieldMapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public ResponseDTO getAll() {
        List<Field> fields = mapper.queryAllField();
        return ResponseDTO.success(fields);
    }
}
