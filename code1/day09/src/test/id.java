package test;

import java.util.Scanner;

public class id {

    public static void sub(String card){
        String year = card.substring(6,10);
        String month = card.substring(10,12);
        String day = card.substring(12,14);
        System.out.println(year + "年" + month + "月" + day + "日");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String card = sc.next();
        sub(card);
    }

}
