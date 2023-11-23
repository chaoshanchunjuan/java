package Test;

public class test10 {
    public static void main(String[] args) {
        double mountain = 8844430;
        double copymountain = 8844430;
        int mount =0;
        while(true){
            copymountain/=2;
            mount++;
            if(copymountain <= 0.1)
                break;
        }
        System.out.println(mount);
    }
}
