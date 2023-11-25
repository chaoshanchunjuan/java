package com.xi;

import java.util.Random;
import java.util.Scanner;

public class text1pro {
    public static void main(String[] args) {
        //打乱数组顺序
        //创建数组
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        //调用函数
        String str2 = mess(str);
        //打印
        System.out.println(str2);
    }

    public static String mess(String str){
        char arr[] = str.toCharArray();
        Random r = new Random();
        for(int i = 0;i < str.length();i++){
            int num = r.nextInt(10);
            if(num < str.length()){
                //符合条件进行交换
                char temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;
            }
        }
        String str2 = new String(arr);
        return str2;
    }
}
