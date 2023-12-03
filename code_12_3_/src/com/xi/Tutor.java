package com.xi;

public class Tutor extends Teacher{
    public Tutor(){

    }
    public Tutor(String Id,String Name){
        super(Id,Name);
    }

    @Override
    public void work(){
        System.out.println("Tutor正在工作");
    }
}
