package homework2;

import java.util.Scanner;

public class homework3 {

    public static void printnum(int num1,int num2,int num3) {
        int arr[] = {num1 , num2 , num3};
        for(int i = 0 ;i <= arr.length ; i++){
            for(int j = 0;j < arr.length - i - 1 ;j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("从大到小的顺序是： ");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        //在主方法中通过键盘录入三个整数。定义一个方法，方法接收三个整数变量，在方法中从大到小依次打印三个变量。执行效果如下：
        //
        //```
        //请输入第一个整数：10
        //请输入第二个整数：30
        //请输入第三个整数：20
        //从大到小的顺序是： 30 20 10

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个整数:");
        int num1 = sc.nextInt();
        System.out.print("请输入第二个整数:");
        int num2 = sc.nextInt();
        System.out.print("请输入第三个整数:");
        int num3 = sc.nextInt();
        printnum(num1,num2,num3);
    }
}
