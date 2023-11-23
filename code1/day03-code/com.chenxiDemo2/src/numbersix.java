import java.util.Scanner;

public class numbersix {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = number1 + number2;
        //number1=6||number2=6||number3%6=0
        boolean result = (number1==6)||(number2==6)||number3%6==0;
        System.out.println(result);
    }
}
