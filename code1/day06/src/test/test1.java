package test;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入机票原价");
        int price =  sc.nextInt();
        System.out.println("请输入月份");
        int day = sc.nextInt();
        System.out.println("请输入头等舱：1   ，经济舱：2");
        int plant = sc.nextInt();
        int money = 0;
        if(day >= 5 &&day <= 10){
            if(plant == 1){
                money =(int)(0.9*price);
            }else{
                money = (int)(0.85*price);
            }
        }else{
            if(plant == 1){
                money =(int)(0.7*price);
            }else{
                money = (int)(0.6*price);
            }
        }
    }
}
