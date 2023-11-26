package com.xi;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.print("[");
        for(int i = 0;i < list.size();i++){
            if(i < 2){
                System.out.print(list.get(i) + ",");
            }else{
                System.out.print(list.get(i));
            }
        }
        System.out.print("]");

        //int
        ArrayList<Integer> list1 = new ArrayList<>();

        //char
        ArrayList<Character> list2 = new ArrayList<>();

        //byte --- Byte
        //short --- Short
        //char --- Character
        //int --- Integer
        //long --- Long
        //float --- Float
        //double --- Double
        //boolean --- Boolean

    }
}
