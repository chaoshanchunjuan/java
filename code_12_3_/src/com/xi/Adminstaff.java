package com.xi;

public class Adminstaff extends Employee{
    public Adminstaff(){

    }

    public Adminstaff(String Id,String Name){
        super(Id,Name);
    }
    @Override
    public void work(){
        System.out.println("Adminstaff正在工作");
    }

}
