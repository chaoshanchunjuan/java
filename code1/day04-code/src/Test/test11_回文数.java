package Test;

import java.util.Scanner;

public class test11_回文数 {
    public static void main(String[] args) {
        //回文数
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int acopy = a;
        int b = 0;
        while(acopy >= 10){
            b = b * 10 + acopy % 10;
            acopy/=10;
        }
        b = b * 10 + acopy;
        if(b == a){
            System.out.println("是回文数");
        }else{
            System.out.println("不是回文数");


        }
    }
}
//1   12
//12   1
//120+1=121
