package com.company;

public class NotLoggedVisitor extends User{
    public NotLoggedVisitor(){
        super(new Password());

    }
    @Override
    public void display(){
        System.out.println("Not Logged Visitor account");
    }
}
