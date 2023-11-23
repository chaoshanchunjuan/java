package test;

public class test_找质数 {
    public static void main(String[] args) {
        System.out.print("1" + " ");
        for(int i = 2 ; i<100 ; i++){
            for(int j = 2 ; j <i ; j++){
                if(i % j == 0){
                    break;
                }else{
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }
}
