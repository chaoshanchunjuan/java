package com.xi;

public class User {
    //属性：用户名、密码、身份证号码、手机号码
    String username;
    String password;
    String idcard;
    String phonenumber;

    public User() {
    }

    public User(String username, String password, String idcard, String phonenumber) {
        this.username = username;
        this.password = password;
        this.idcard = idcard;
        this.phonenumber = phonenumber;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return idcard
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置
     * @param idcard
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取
     * @return phonenumber
     */
    public String getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置
     * @param phonenumber
     */
    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String toString() {
        return "User{username = " + username + ", password = " + password + ", idcard = " + idcard + ", phonenumber = " + phonenumber + "}";
    }
}
