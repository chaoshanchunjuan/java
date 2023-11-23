/*package Test;

import java.util.Scanner;

public class test5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grade;
        int money;
        while(true){
            System.out.println("请输入用户等级");
            grade = sc.nextInt();
            if(grade !=0||grade !=1){
                System.out.println("请重新输入用户等级");
                break;
            }
            System.out.println("请输入用户消费金额");
            money = sc.nextInt();
        }
        double sum = 0;
        if(grade ==0){
            if(money >= 100) {
                sum = money * 0.9;
            } else {
                sum = money;
            }
        }
        else{
            if(money >= 200) {
               sum = money * 0.75;
            }
            else {
                sum = money;
            }
            }

        }

    }
*/