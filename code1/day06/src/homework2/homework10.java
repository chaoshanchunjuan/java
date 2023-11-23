package homework2;

public class homework10 {
    public static void main(String[] args) {
        //需求：
        //
        //​	定义一个方法copyOfRange(int[] arr,int from, int to)
        //
        //功能：
        //
        //​	将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，
        //
        //​	并将新数组返回。
        int arr[] = {0,1,2,3,4,5,6,7};
        int from = 2;
        int to = 5;
        int arrcopy[] = copyOfRange(arr , from , to);
        for(int i = 0 ; i < to - from ; i++){
            System.out.println(arrcopy[i]);
        }
    }

    public static int[] copyOfRange(int arr[] , int from , int to){
        int arr1[] = new int[to - from];
        int count = 0;
        for(int i = from ; i < to ; i++){
            arr1[count++] = arr[i];
        }
        return arr1;
    }

}
