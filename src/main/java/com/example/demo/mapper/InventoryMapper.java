package com.example.demo.mapper;

import com.example.demo.bean.Inventory;

import java.util.List;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/4 14:17
 * description:
 */
public interface InventoryMapper {


    /**
     * 插入数据的方法
     * @param inventory
     * @return
     */
    int addInventory(Inventory inventory);

    /**
     * 查询全部
     * @return
     */
    List<Inventory> queryall();

    /**
     * 查询一条
     * @param iId
     * @return
     */
    Inventory selectInventory(int iId);

    /**
     * 修改方法
     * @return
     */
    int updateInventory(Inventory inventory);

    /**
     * 删除方法
     * @param
     * @return
     */
    int deletInventory(int iId);

}
