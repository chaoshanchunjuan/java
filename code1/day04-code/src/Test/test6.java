package Test;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        double money2 = money - (money *0.1) - 5000;
        double submoney = 0;
        double summoney = money2 + 5000;
        if(money2 <= 5000)
        {
            ;
        }else{
            if(money2 > 0 && money2 <= 3000){
                submoney = money2 * 0.03;
            }else if(money2 > 3000 && money2 <= 15000){
                submoney = 90 + (money2 - 3000) * 0.1;
            }else if(money2 > 15000 && money2 <= 40000){
                submoney = 1290 + (money2 - 15000) * 0.2;
            }else if(money2 > 40000 && money2 <= 75000){
                submoney = 6290 + (money2 - 40000) * 0.25;
            }else if(money2 > 75000 && money2 <= 130000){
                submoney = 15040 + (money2-75000) * 0.3;
            }else if(money2 > 130000 && money2 <= 210000){
                submoney = 31540 + (money2 - 130000) * 135000;
            }else{
                submoney = 67540 + (money2 - 210000) * 0.45;
            }
        }
        summoney =summoney - submoney;
        System.out.println(summoney);





    }
}
