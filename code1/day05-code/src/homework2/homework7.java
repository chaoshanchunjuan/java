package homework2;

public class homework7 {
    public static void main(String[] args){
//        //定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）
//        int arr[] = {1,2,3,4,5,6,7,8,9};
//        int arr1[] = new int[arr.length/2+1];//奇数
//        int arr2[] = new int[arr.length/2+1];//偶数
//        int count1 =0;//奇数
//        int count2 =0;//偶数
//        for(int i=0;i<arr.length;i++){
//            if(arr[i]%2 == 0){
//                arr2[count2++] = arr[i];
//            }else{
//                arr1[count1++] = arr[i];
//            }
//        }
//        int arrtwice[] = new int[arr.length];
//        for(int i =0;i<count1;i++){
//            arrtwice[i] = arr1[i];
//        }
//        int count = 0;
//        for(int i = count1+1;i<arr.length;i++){
//            arrtwice[i] = arr2[count++];
//        }
//        for(int i =0;i<arr.length;i++){
//            System.out.print(arrtwice[i] + " ");
//        }
//        //定义一个数组其中包含多个数字。用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）

        int arr[] = {1,2,3,4,5,6,7,8,9};
        int arrtwice[] = new int[arr.length];
        int count1 =0;
        int count2 =arr.length-1;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 ==0){
                arrtwice[count2] = arr[i];
                count2--;
            }else{
                arrtwice[count1]=arr[i];
                count1++;
            }
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arrtwice[i] + " ");
        }
    }
}
