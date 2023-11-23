package homework2;

public class homework9 {
    public static void main(String[] args) {
        //定义一个方法copyOf(int[] arr, int newLength)
        //
        //功能：
        //
        //​	将数组arr中的newLength个元素拷贝到新数组中，并将新数组返回，从索引为0开始
        int arr[] = {0,1,2,3,4,5,6,7,8,9};
        int newLength = 7;
        int arr1[] = copyOf(arr,newLength);
        for(int i = 0 ; i < newLength ; i++){
            System.out.println(arr1[i]);
        }
    }

    public static int[] copyOf(int arr[] , int newLength){
        int arrcopy[] = new int[newLength];
        for(int i = 0 ; i < newLength ; i++){
            arrcopy[i] = arr[i];
        }
        return arrcopy;
    }


}
