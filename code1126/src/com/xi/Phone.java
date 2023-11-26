package com.xi;

public class Phone {
    String brand;
    int money;

    public Phone() {
    }

    public Phone(String brand, int money) {
        this.brand = brand;
        this.money = money;
    }

    /**
     * 获取
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 设置
     * @param brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 获取
     * @return money
     */
    public int getMoney() {
        return money;
    }

    /**
     * 设置
     * @param money
     */
    public void setMoney(int money) {
        this.money = money;
    }

    public String toString() {
        return "Phone{brand = " + brand + ", money = " + money + "}";
    }
}
