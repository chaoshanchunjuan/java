package homework2;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        //键盘录入一个正整数
        //
        //定义一个方法,该方法的功能是计算该数字是几位数字,并将位数返回
        //
        //在main方法中打印该数字是几位数
        //
        //演示格式如下:
        //(1)演示一:
        //	请输入一个整数:1234
        //	控制台输出:1234是4位数字
        //(2)演示二:
        //	请输入一个整数:34567
        //	控制台输出:34567是5位数字
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = count(num);
        System.out.println(sum);
    }

    public static int count(int num){
        int count = 1;
        while(num > 10){
            num/=10;
            count++;
        }
        return count;
    }


}
