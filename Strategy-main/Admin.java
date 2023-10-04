package com.company;

public class Admin extends User{
    public Admin(){
        super(new Graphical_Key());}
        @Override
    public void display(){
            System.out.println("Admin account");
        }

}
