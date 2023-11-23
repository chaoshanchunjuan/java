package homework2;

import java.util.Scanner;

public class homework8 {
    public static void main(String[] args) {
        //定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)
        //
        //功能：
        //
        //​	将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始索引");
        int fromIndex = sc.nextInt();
        System.out.println("请输入结束索引");
        int toIndex = sc.nextInt();
        System.out.println("请输入替换的数值");
        int value = sc.nextInt();
        fill(arr,fromIndex,toIndex,value);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void fill(int[] arr,int fromIndex,int toIndex,int value){
        if(fromIndex > arr.length-1 || toIndex > arr.length-1)
        {
            System.out.println("error");
        }else{
            for(int i = fromIndex;i<toIndex;i++){
                arr[i] = value;
            }
        }
    }
}
