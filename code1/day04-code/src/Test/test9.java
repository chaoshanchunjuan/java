package Test;

import java.util.Scanner;

public class test9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        int max = num1 > num2 ? num1 : num2;
        int min = num1 > num2 ? num2 : num1;
        for(int i = min + 1;i < max;i++){
            if(i % 3 == 0 && i % 5 == 0){
                sum++;
            }
        }
        System.out.println(sum);
    }
}
