package test;

public class substring {
    public static void main(String[] args) {
//        String password = "2998772276";
//        String firstWord = password.substring(0,1);
//        String lastWord = password.substring(9,10);
//        String combine = firstWord + lastWord;
//        System.out.println(combine);
//        String sentance = "Sb,wdnmd";
//        sentance = sentance.replace("wdnmd","***");
//        System.out.println(sentance);
        String arr[] = {"tmd","tmd","wdnmd"};
        for(int i = 0 ; i <arr.length ; i++){
            arr[i] = arr[i].replace("tmd","***");
        }
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i]);
        }


    }
}
