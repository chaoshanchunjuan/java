package com.xi;

public class Teacher extends Employee{
    public Teacher(){

    }

    public Teacher(String Id,String Name){
        super(Id,Name);
    }

    @Override
    public void work(){
        System.out.println("Teacher在工作");
    }
}
