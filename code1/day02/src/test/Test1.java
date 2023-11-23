package test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args){
        System.out.println("请输入整数");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int num1=number%10;
        int num2=number/10%10;
        int num3=number/100;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }
}
