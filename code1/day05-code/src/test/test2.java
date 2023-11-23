package test;

import java.util.Random;

public class test2 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        Random r = new Random();
        int addsum = 0;
        int av = 0;
        int mount = 0;
        for(int i=0;i<10;i++){
            arr[i] = r.nextInt(99) + 1;
            System.out.println(arr[i]);
            addsum = addsum +arr[i];
        }
        av = addsum/10;
        for(int i = 0;i<10;i++){
            if(arr[i] <av){
                mount++;
            }
        }
        System.out.println(addsum);
        System.out.println(av);
        System.out.println(mount);
    }
}
