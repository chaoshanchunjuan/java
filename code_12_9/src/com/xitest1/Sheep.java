package com.xitest1;

public class Sheep extends Animal{
    @Override
    public void eat(){
        System.out.println("Sheep Eat");
    }

    public Sheep(){

    }

    public Sheep(String name,int age){
        this.name = name;
        this.age = age;
    }
}
