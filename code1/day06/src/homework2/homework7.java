package homework2;

import java.util.Scanner;

public class homework7 {
    public static void main(String[] args) {
        //定义一个方法fill(int[] arr,int value)
        //
        //功能：
        //
        //​	将数组arr中的所有元素的值改为value
        int arr[] = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fill(arr,num);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void fill(int arr[],int value){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = value;
        }
    }


}
