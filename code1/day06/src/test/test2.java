package test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        char arr[] = new char[52];
        for(int i = 0 ; i < 26 ; i++){
            arr[i] = (char)(97 + i);
        }
        for(int i = 26 ; i < 52 ; i++){
            arr[i] = (char)(39 + i);
        }
//        for(int i = 0 ; i < 52 ; i++){
//            System.out.print(arr[i]);
//        }
        Random r = new Random();
        String password = "";
        for(int i = 0 ; i < 3 ; i++){
            int num = r.nextInt(52);
            password = password + arr[num];
        }
        for(int i = 0 ; i < 2 ; i++){
            int passnum = r.nextInt(10);
            password = password + passnum;
        }
        System.out.println(password);
    }
}
