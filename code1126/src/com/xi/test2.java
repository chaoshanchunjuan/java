package com.xi;

import java.util.ArrayList;
import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        Student s1 = new Student("a", 11);
//        Student s2 = new Student("b", 12);
//        Student s3 = new Student("c", 13);
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        for(int i =0;i < list.size();i++){
//            Student str = list.get(i);
//            System.out.println(str.getName() + "," + str.getAge());
//        }
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        for(int i =0 ; i < 3 ; i++){
            Student s = new Student();
            String name = sc.next();
            int age = sc.nextInt();
            s.setName(name);
            s.setAge(age);
            list.add(s);
        }
        for(int i =0;i < list.size();i++){
            Student str = list.get(i);
            System.out.println(str.getName() + "," + str.getAge());
        }
    }
}
