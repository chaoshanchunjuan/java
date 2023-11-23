package test;
//冒泡排序
public class sort {
    public static void main(String[] args) {
        int arr[] = {1,4,2,5,3,8,6,7,9,10};
        System.out.println("排序前数组");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(" ");
            }
        }
        for(int i = 0 ; i < arr.length-1 ; i++){
            for(int j = 0 ; j < arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后数组");
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
            if(i != arr.length-1){
                System.out.print(" ");
            }
        }
    }
}
