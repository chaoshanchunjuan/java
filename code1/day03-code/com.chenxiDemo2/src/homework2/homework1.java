package homework2;

public class homework1 {
    public static void main(String[] args){
        int father = 177;
        int mother = 165;
        int son=(int)((father + mother)*1.08/2);
        int daughter = (int)((father*0.923 + mother)/2);
        System.out.println(son);
        System.out.println(daughter);
    }
}
