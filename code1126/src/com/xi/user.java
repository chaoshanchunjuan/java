package com.xi;

public class user {
    String id;
    String username;
    String password;

    public user(){

    }

    public user(String id,String username,String password){
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String gerPassword(){
        return password;
    }
}
