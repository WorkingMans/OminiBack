package com.example.demo.bean;

/**
 * projectName: demo
 *
 * @author: 陈爱琦
 * time: 2020/11/2 16:00
 * description:
 */
public class User {

    private int uId;
    private String uAccount;
    private String uPassword;
    private int uAge;
    private String uSex;

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuAccount() {
        return uAccount;
    }

    public void setuAccount(String uAccount) {
        this.uAccount = uAccount;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public int getuAge() {
        return uAge;
    }

    public void setuAge(int uAge) {
        this.uAge = uAge;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }
}
