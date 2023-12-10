package com.xitest1;

public class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("Dog Eat");
    }

    public Dog(){

    }

    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
}
