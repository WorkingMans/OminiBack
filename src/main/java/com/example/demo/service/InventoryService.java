package com.example.demo.service;

import com.example.demo.bean.Inventory;
import com.example.demo.bean.Result;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/4 14:11
 * description:
 */
public interface InventoryService {
    Result addInventory(Inventory inventory);

    Result selectInventory(int iId);

    Result updateInventory(Inventory inventory);

    Result deletInventory(int iId);

    Result queryall();
}
