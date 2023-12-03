package com.xi;

public class Lecture extends Teacher{
    public Lecture(){

    }


    public Lecture(String Id,String Name){
        super(Id,Name);
    }

    @Override
    public void work(){
        System.out.println("Lecture正在工作");
    }
}
