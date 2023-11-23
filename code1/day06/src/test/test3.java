package test;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        for(int i = 0 ; i < 6 ; i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0 ; j < 5 ; j++){
            if(arr[j] > arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        arr[5] = 0;

        for(int j = 0 ; j < 4 ; j++){
            if(arr[j] < arr[j + 1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }

        arr[4] = 0;

        double av = (double)((arr[0] + arr[1] + arr[2] + arr[3])/4.0);
        System.out.println(av);
    }
}
