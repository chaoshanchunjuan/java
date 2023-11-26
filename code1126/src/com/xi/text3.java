package com.xi;

import java.util.ArrayList;
import java.util.Scanner;

public class text3 {
    public static void main(String[] args) {
        ArrayList<user> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i =0;i < 3; i++){
            user u = new user();
            System.out.println("id");
            String id = sc.next();
            System.out.println("username");
            String username = sc.next();
            System.out.println("password");
            String password = sc.next();
            u.setId(id);
            u.setPassword(password);
            u.setUsername(username);
            list.add(u);
        }
        //search
        System.out.println("search id");
        String idsearch = sc.next();
        boolean result = search(idsearch,list);
        System.out.println(result);
    }

    public static boolean search(String id,ArrayList<user> list){
        for(int i = 0;i < list.size();i++){
            user u = list.get(i);
            if(u.getId().equals(id)){
                return true;
            }
        }
        return false;
    }
}
