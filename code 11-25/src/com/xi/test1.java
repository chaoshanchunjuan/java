package com.xi;

import java.util.Random;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        //char arr[] = str.toCharArray();
        char arr[] = new char[str.length()];
        for(int i =0;i < str.length();i++){
            arr[i] = str.charAt(i);
        }
        Random r = new Random();
        for(int i =0;i < str.length();i++){
            int num = r.nextInt(10);
            if(num < str.length()){
                char temp = arr[i];
                arr[i] = arr[num];
                arr[num] = temp;
            }
        }
        String str2 = new String(arr);

        System.out.println(str2);


    }
}
