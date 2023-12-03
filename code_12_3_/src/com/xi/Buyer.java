package com.xi;

public class Buyer extends Adminstaff{
    public Buyer(){

    }
    public Buyer(String Id,String Name){
        super(Id,Name);
    }

    @Override
    public void work(){
        System.out.println("Buyer正在工作");
    }
}
