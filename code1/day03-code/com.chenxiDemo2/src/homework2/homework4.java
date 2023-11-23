package homework2;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入三位数");
        int number = sc.nextInt();
        int num1 = number%10;
        int num2 = number/10%10;
        int num3 = number/100;
        System.out.println(num1+num2+num3);

    }
}
