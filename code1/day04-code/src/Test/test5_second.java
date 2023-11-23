package Test;

import java.util.Scanner;

/*public class test5_second {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();
        double money = sc.nextDouble();
        double sum = money;
        if(grade == 0){
            if(money >= 100){
                sum = sum *0.9;
            }
        }else{
            if(money >= 200){
                sum = sum * 0.75;
            }
        }
    System.out.println(sum);
    }
}
*/
public class test5_second {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = 0;
        double money = 0;
        while(true)
        {
            //提示输入grade和money
            System.out.println("请输入用户等级和消费金额");
            grade = sc.nextInt();
            money = sc.nextDouble();
            if(grade != 0 && grade != 1)
            {
                //error
                System.out.println("输入不符合，请重新输入用户等级和消费金额");
                //提示重新输入
                //System.out.println("bug");
            }else{
                break;
            }
        }
        double sum = money;
        if(grade == 0){
            if(money >= 100){
                sum = sum *0.9;
            }
        }else{
            if(money >= 200){
                sum = sum * 0.75;
            }
        }
        System.out.println(sum);
    }
    }
