package com.example.demo.mapper;

import com.example.demo.bean.Types;

import java.util.List;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/3 15:13
 * description:types类数据库操作的mapper
 */
public interface TypesMapper {

    /**
     * 插入数据的方法
     * @param types
     * @return
     */
    int insertTypes(Types types);

    /**
     * 查询全部
     * @return
     */
    List<Types> queryTypeList();

    /**
     * 修改方法
     * @return
     */
    int updateTypes(Types types);

}
