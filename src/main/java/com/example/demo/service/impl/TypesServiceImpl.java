package com.example.demo.service.impl;

import com.example.demo.bean.Result;
import com.example.demo.bean.Types;
import com.example.demo.mapper.TypesMapper;
import com.example.demo.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/3 15:10
 * description:
 */
@Service
public class TypesServiceImpl implements TypesService {

    @Autowired
    private TypesMapper typesMapper;

    @Override
    public Result saveTypes(Types types) {

        int rows = typesMapper.insertTypes(types);

        Result result = new Result();

        if (rows>0){
            //获取新的类型集合
            List<Types> list = typesMapper.queryTypeList();
            result.setCode(1);
            result.setData(list);
        }else{
            result.setCode(0);
        }

        return null;
    }

}
