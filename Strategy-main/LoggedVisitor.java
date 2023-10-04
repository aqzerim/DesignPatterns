package com.company;

public class LoggedVisitor extends User{

    public LoggedVisitor(){
        super(new PIN());

    }
    @Override
    public void display(){
        System.out.println("Logged Visitor account");
    }}

