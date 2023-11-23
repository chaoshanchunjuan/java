package Test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args){
        System.out.println("请依次输入存储年份以及存储金额（金额数1000起）");
        Scanner sc = new Scanner(System.in);
        int year;
        double money;
        while(true){
            year = sc.nextInt();
            money = sc.nextDouble();
            if(money <1000)
                System.out.println("1000起存，请重新输入年份和金额");
            else
                break;
        }
        double a =0;
            switch(year){
                case 1 -> a = 0.0225;
                case 2 -> a=0.027;
                case 3 -> a=0.0325;
                case 5 -> a=0.036;
                default -> System.out.println("错误");
            }
        System.out.println(money + money * a * year);
    }
}
