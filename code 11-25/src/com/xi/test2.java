package com.xi;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        //创建数组
        char arr[] = new char[4];
        //创建随机数字，存入数组随机位子
        Random r = new Random();
        int add = r.nextInt(4);
        int num = r.nextInt(10);
        arr[add] = (char)(num + 48);
        //System.out.println(arr[add]);
        //创建随机字母3次，存入数组
        for(int i =0;i < 4;i++){
            if(i == add){
                continue;
            }else {
                //随机字母
                arr[i] = randomWord();
            }
        }

        //转为字符串
        String str = new String(arr);

        //打印
        System.out.println(str);
    }

    public static char randomWord(){
        char arr[] = new char[52];
        for(int i = 0;i < 26;i++){
             arr[i] = (char)('a' + i);
        }
        for(int i = 26 ;i < 52;i++){
            arr[i] = (char)('A' + (i -26));
        }
        Random r = new Random();
        int num = r.nextInt(53);
        return arr[num];
    }
}
