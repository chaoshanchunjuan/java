package homework2;

import java.util.Scanner;

public class homework4 {

    public static double absolutenum(double num){
        if(num < 0 ){
            num = -num;
        }
        return num;
    }

    public static void main(String[] args) {
        //数字是有绝对值的，负数的绝对值是它本身取反，非负数的绝对值是它本身。请定义一个方法，方法能够得到小数类型数字的绝对值并返回。请定义方法并测试。
       Scanner sc = new Scanner(System.in);
       double num = sc.nextDouble();
        System.out.println(num);
        double absolute = absolutenum(num);
        System.out.println(absolute);
    }


}
