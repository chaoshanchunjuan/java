package com.xi;

public class Maintainer extends Adminstaff{
    public Maintainer(){

    }
    public Maintainer(String Id,String Name){
        super(Id,Name);
    }

    @Override
    public void work(){
        System.out.println("Maintainer正在工作");
    }
}
