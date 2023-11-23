package homework2;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args){
//        请创建一个长度为6的整数数组，并为数组中的元素赋值。遍历数组，打印所有元素，元素之间用空格隔开。比如：
//
//```
//        数组为：{1,2,3,4,5}
//        打印结果：1 2 3 4 5
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < 6;i++){
            arr[i] = sc.nextInt();
        }
        for(int i = 0;i < 6;i++){
            System.out.print(arr[i]);
            if(i != 5){
                System.out.print(" ");
            }
        }

    }
}
