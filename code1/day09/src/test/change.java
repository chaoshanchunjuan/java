package test;

import java.util.Scanner;

public class change {
    public static void change(int money){
        String arr[] = {"零","佰","零","拾","零","万","零","仟","零","佰","零","拾","零","元"};
        int count = arr.length-2;
        while(money > 0){
            switch(money%10){
                case 0 : arr[count] = "零";break;
                case 1 : arr[count] = "壹";break;
                case 2 : arr[count] = "贰";break;
                case 3 : arr[count] = "叁";break;
                case 4 : arr[count] = "肆";break;
                case 5 : arr[count] = "伍";break;
                case 6 : arr[count] = "陆";break;
                case 7 : arr[count] = "柒";break;
                case 8 : arr[count] = "捌";break;
                case 9 : arr[count] = "玖";break;
            }
            money/=10;
            count-=2;
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        change(money);
    }
}
