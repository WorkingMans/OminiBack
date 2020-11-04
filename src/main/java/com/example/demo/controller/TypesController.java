package com.example.demo.controller;

import com.example.demo.bean.Result;
import com.example.demo.bean.Types;
import com.example.demo.service.TypesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/3 15:04
 * description:类别模块的controller
 */
@RestController
@RequestMapping("types")
public class TypesController {

    @Autowired
    private TypesService typesService;
    /**
     * 保存types的方法
     * @param types
     * @return
     */
    @PostMapping("save")
    public Result saveTpyes(Types types){

        Result result = typesService.saveTypes(types);

        return null;
    }

}
