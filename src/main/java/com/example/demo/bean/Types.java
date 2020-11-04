package com.example.demo.bean;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/3 15:00
 * description:分类对应的实体类
 */
public class Types {

    private int tId;
    private String tName;
    private String tDes;
    private String tNote;
    private int tWeight = 0;

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public String gettDes() {
        return tDes;
    }

    public void settDes(String tDes) {
        this.tDes = tDes;
    }

    public String gettNote() {
        return tNote;
    }

    public void settNote(String tNote) {
        this.tNote = tNote;
    }

    public int gettWeight() {
        return tWeight;
    }

    public void settWeight(int tWeight) {
        this.tWeight = tWeight;
    }
}
