package homework2;

import java.util.Random;

public class homework3 {
    public static void main(String[] args){
        //创建一个长度为6的整数数组。请编写代码，随机生成六个0（包含）-100（不包含）之间的整数存放到数组中，然后计算出数组中所有元素的和并打印。
        int arr[] = new int[6];
        Random r =new Random();
        int sum = 0;
        for(int i = 0;i < 6 ;i++){
            arr[i] = r.nextInt(100);
            System.out.println(arr[i]);
            sum=sum+arr[i];
        }
        System.out.println(sum);
    }
}
