package homework2;

import java.util.Random;

public class homework5 {
    public static void main(String[] args) {
        //定义一个数组来存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
        double arr[] = new double[10];
        Random r = new Random();
        double sum = 0;
        for(int i = 0 ; i < 10 ;i++){
            arr[i] = r.nextInt(101);
            System.out.print(arr[i] + " ");

            sum = sum + arr[i];
        }
        System.out.println();
        double av = sum / 10;
        System.out.println(av);
    }
}
