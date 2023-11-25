package com.xi;

import java.util.ArrayList;

public class ArrayListDemom {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("1aaa");
        list.add("2aaa");
        list.add("3aaa");
        list.add("4aaa");
        list.add("5aaa");

        //删除
        boolean result = list.remove("aaa");

        //list.set(0,"abcd");
        list.get(0);
        System.out.println(list);
    }
}
