package com.xitest1;

public class Frog extends Animal{
    @Override
    public void eat(){
        System.out.println("Frog Eat");
    }

    public Frog(){

    }

    public Frog(String name,int age){
        this.name = name;
        this.age = age;
    }

}
