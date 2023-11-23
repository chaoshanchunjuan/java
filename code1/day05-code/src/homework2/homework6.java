//package homework;
//
//import java.util.Scanner;
//
//public class homework6 {
//    public static void main(String[] args){
////        有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数字。
////        要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
////
////```java
////        请输入一个整数数字：
////        50
////        生成的新数组是：12 14 23 45 50 66 68 70 77 90 91
////```
//        int arr[] = {12,14,23,45,66,68,70,77,90,91};
//        System.out.println("重组前的数组");
//        for(int i = 0; i< arr.length;i++){
//            System.out.print(arr[i] + ",");
//        }
//        Scanner sc = new Scanner(System.in);
//        int num =sc.nextInt();
//        for(int i = 0 ;i <arr.length;i++){
//            if(num <= arr[i]){
//               for(int j = arr.length-1;j >= i ;j--){
//                   arr[j+1] = arr[j];
//               }
//               arr[i-1] = num;
//               break;
//            }
//        }
//        System.out.println("重组完的数组");
//        for(int i = 0; i< arr.length;i++){
//            System.out.print(arr[i] + ",");
//        }
//    }
//}

package homework2;

import java.util.Scanner;

public class homework6{
    public static void main(String[] args){
        int arr[] = {12,14,23,45,66,68,70,77,90,91};
        int arrtwice[] = new int [arr.length+1];
        System.out.println("重组前的数组");
        for(int i = 0; i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int count = 0;
        for(int i = 0 ;i <arr.length;i++){
            arrtwice[i]=arr[i];
            if(num <= arr[i]){
               arrtwice[i] = num;
               count = i;
               break;
            }
            count = arr.length;
        }
        if(count != arr.length){
            for(int i = count;i<arr.length; i++){
                arrtwice[i+1] = arr[i];
            }
        }else{
            arrtwice[count] = num;
        }

        System.out.println("重组完的数组");
        for(int i = 0; i< arrtwice.length;i++){
            System.out.print(arrtwice[i] + " ");
        }



    }
}