package test;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入密码");
        int password = sc.nextInt();
        int count = 1 ;
        int temp = password;
        int temp2 = password;
        while(password >= 10){
            password/=10;
            count++;
        }
        System.out.println(count);
        int passwordpro = 0;
        for(int i = 0 ; i < count ; i++){
            passwordpro = passwordpro*10 + ((temp2%10+5)%10);
            temp2/=10;
        }
        System.out.println(passwordpro);
    }

}
