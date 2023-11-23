package homework2;

import java.util.Scanner;

public class homework2 {

    public static int compare(int num1,int num2,int num3){
        int temp = num1 > num2 ? num1 : num2;
        int max = temp > num3 ? temp : num3;
        return max;
    }

    public static void main(String[] args) {
        //定义一个方法，该方法能够找出三个整数中的最大值并返回。在主方法中调用方法测试执行
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int max = compare(num1,num2,num3);
        System.out.println(max);
    }
}
