package homework2;

public class homework2 {
    public static void main(String[] args){
        //现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印
        double arr[] = {12.9, 53.54, 75.0, 99.1, 3.14};
        double min = minOfArr(arr);
        System.out.println(min);
    }
    public static double minOfArr(double arr[]){
       double min = 0;
       for(int i = 1;i < arr.length ;i++){
           min = arr[i] < arr[i-1] ? arr[i] : arr[i-1];
       }
       return min;
    }
}
