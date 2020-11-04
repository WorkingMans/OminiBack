package com.example.demo.service.impl;

import com.example.demo.bean.Inventory;
import com.example.demo.bean.Result;
import com.example.demo.mapper.InventoryMapper;
import com.example.demo.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/4 14:21
 * description:
 */
@Service
public class InventoryServiceImpl implements InventoryService {

    @Autowired
    private InventoryMapper inventoryMapper;

    /**
     * 添加库存数据
     * @param inventory
     * @return
     */
    @Override
    public Result addInventory(Inventory inventory) {

        int i = inventoryMapper.addInventory(inventory);

        Result result = new Result();

        if (i>0){
            List<Inventory> list = inventoryMapper.queryall();
            result.setCode(1);
            result.setData(list);
        }else{
            result.setCode(0);
        }

        return result;
    }

    /**
     * 查询一条
     * @param iId
     * @return
     */
    @Override
    public Result selectInventory(int iId) {

        Inventory reinventory = inventoryMapper.selectInventory(iId);

        Result result = new Result();

        if (reinventory != null) {
            //查询成功 设置返回状态为1
            result.setCode(1);
            result.setData(reinventory);
        }else {
            result.setCode(0);
        }

        return result;
    }

    /**
     * 更新一条数据
     * @param inventory
     * @return
     */
    @Override
    public Result updateInventory(Inventory inventory) {

        int j = inventoryMapper.updateInventory(inventory);

        Result reupdate = new Result();

        if (j>0){
            List<Inventory> list = inventoryMapper.queryall();
            reupdate.setCode(1);
            reupdate.setData(list);
        }else{
            reupdate.setCode(0);
        }


        return reupdate;
    }

    /**
     * 删除库存数据
     * @param iId
     * @return
     */
    @Override
    public Result deletInventory(int iId) {

        int flag = inventoryMapper.deletInventory(iId);

        Result result = new Result();

        if(flag != 0){
            List<Inventory> list = inventoryMapper.queryall();
            result.setCode(1);
            result.setData(list);
        }else{
            result.setCode(0);
        }

        return result;
    }

    /**
     * 查询全部库存
     * @param
     * @return
     */
    @Override
    public Result queryall() {

        List<Inventory> list1 = inventoryMapper.queryall();

        Result result = new Result();

        if (list1 != null) {
            //查询成功 设置返回状态为1
            result.setCode(1);
            result.setData(list1);
        }else {
            result.setCode(0);
        }


        return result;
    }

}
