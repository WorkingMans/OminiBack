package com.example.demo.bean;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/4 14:06
 * description:库存
 */
public class Inventory {

    private int iId;
    private String iName;
    private String iColor;
    private String iPrice;
    private String iInventory;


    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public String getiColor() {
        return iColor;
    }

    public void setiColor(String iColor) {
        this.iColor = iColor;
    }

    public String getiPrice() {
        return iPrice;
    }

    public void setiPrice(String iPrice) {
        this.iPrice = iPrice;
    }

    public String getiInventory() {
        return iInventory;
    }

    public void setiInventory(String iInventory) {
        this.iInventory = iInventory;
    }
}
