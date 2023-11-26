package com.xi;

import java.util.ArrayList;

public class text4 {
    public static void main(String[] args) {
        ArrayList<Phone> list = new ArrayList<>();
        //存入对象
        Phone p1 = new Phone("小米",1000);
        Phone p2 = new Phone("苹果",8000);
        Phone p3 = new Phone("菠萝",2999);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        ArrayList<Phone> result = search(list);

        for(int i =0;i < result.size();i++){
            Phone p = result.get(i);
            System.out.println(p.getBrand() + "," + p.getMoney());
        }
    }

    public static ArrayList<Phone> search(ArrayList<Phone> list){
        ArrayList<Phone> list2 = new ArrayList<>();
        for(int i = 0;i < list.size();i++){
            Phone p = list.get(i);
            if(p.getMoney() < 3000){
                Phone p1 = new Phone();
                //return p.getBrand();
                String brand = p.getBrand();
                int money = p.getMoney();
                p1.setBrand(brand);
                p1.setMoney(money);
                list2.add(p1);
            }
        }
        return list2;
    }
}
