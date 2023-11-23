package Test;

public class test2 {
    public static void main(String[] args){
        int phone = 7988;
        int plan1 = phone-1500;
        int plan2 = (int)(phone * 0.8);
        int result = plan1 > plan2 ? 2 : 1;
        System.out.println(result);

    }
}
