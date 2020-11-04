package com.example.demo.controller;

import com.example.demo.bean.Inventory;
import com.example.demo.bean.Result;
import com.example.demo.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/4 14:09
 * description:
 */
@RestController
@RequestMapping("inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    /**
     * 添加库存
     * @param
     * @return
     */
    @PostMapping("add")
    public Result addInventory(Inventory inventory){

        Result result = inventoryService.addInventory(inventory);

        return result;
    }

    /**
     * 查询一条
     * @param
     * @return
     */
    @PostMapping("select")
    public Result selectInventory(int iId){

        Result result = inventoryService.selectInventory(iId);

        return result;
    }

    /**
     * 查询全部
     * @param
     * @return
     */
    @GetMapping("queryall")
    public Result queryall(){

        Result result = inventoryService.queryall();

        return result;
    }

    /**
     * 更新
     * @param
     * @return
     */
    @PostMapping("update")
    public Result updateInventory(Inventory inventory){

        Result result = inventoryService.updateInventory(inventory);

        return result;
    }

    /**
     * 删除
     * @param
     * @return
     */
    @PostMapping("delet")
    public Result deletInventory(int iId){

        Result result = inventoryService.deletInventory(iId);

        return result;
    }

}
