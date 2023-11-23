package homework2;

import java.util.Scanner;

public class homework1 {

    public static double compare(double num1,double num2){
        double min = num1 < num2 ? num1 : num2;
        return min;
    }


    public static void main(String[] args) {
        //定义一个方法，该方法能够找出两个小数中的较小值并返回。在主方法中调用方法进行测试。
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        double min = compare(num1,num2);
        System.out.println(min);
    }
}
