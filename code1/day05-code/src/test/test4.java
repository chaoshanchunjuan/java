//package test;
//
//import java.util.Scanner;
//
//public class test4 {
//    public static void main(String[] args){
//        int arr[] = {0,1,2,3,4,5,6,7,8,9};
//        Scanner sc = new Scanner(System.in);
//        int from = sc.nextInt();
//        int to = sc.nextInt();
//        int arr2[]=copyOfRange(arr,from,to);
//        for(int i = 0;i<arr.length;i++){
//            System.out.print(arr[i] + ",");
//        }
//    }
//    public static int[] copyOfRange(int arr[],int from,int to){
//        int arr1[] = new int[to-from];
//        int count = 0;
//        for(int i = from;i<to;i++) {
//            arr1[count]=arr[i];
//            count++;
//        }
//        return arr1;
//    }
//}
package test;

import java.util.Scanner;

public class test4{
    public static void main(String[] args){
        //from  to
        Scanner sc = new Scanner(System.in);
        int from = sc.nextInt();
        int to = sc.nextInt();
        //arr
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        //调用函数
        int arr2[] = copyOfRange(arr,from,to);
        //打印
        for(int i = 0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
    public static int[] copyOfRange(int arr[],int from,int to){
        int arrcopy[] = new int[to-from];
        int count = 0;
        for(int i = from ;i < to ;i++){
            arrcopy[count++] = arr[i] ;
        }
        return arrcopy;
    }
}
