package Test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = num1 > num2 ? num1 :num2;
        int max = num4 > num3 ? num4 : num3;
        System.out.println(max);
    }
}
