package test;

public class test3 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};

        int temp = arr[0];
        arr[0] = arr[4];
        arr[4] = temp;
        for(int i= 0;i <5;i++){
            System.out.println(arr[i]);
        }
    }
}
