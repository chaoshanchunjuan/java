package Test;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //提示输入两个整数
        System.out.println("请输入两个整数");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        //提示输入进行的运算
        //1.+    2.-    3.*   4./
        System.out.println("请输入进行的运算:1.+    2.-    3.*   4./");
        int num3 = sc.nextInt();
        switch(num3){
            case 1 -> num3 = num1 + num2;
            case 2 -> num3 = num1 - num2;
            case 3 -> num3 = num1 * num2;
            case 4 -> num3 = num1 / num2;
        }
        System.out.println(num3);
    }
}
