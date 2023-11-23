package test;

public class test1 {
    public static void main(String[] args){
        int arr[] = {33,5,22,44,20};
        int max =0;
        for(int i=1;i<=4;i++){
            max = arr[i] >arr[i-1]?arr[i]:arr[i-1];
        }
        System.out.println(max);
    }
}
