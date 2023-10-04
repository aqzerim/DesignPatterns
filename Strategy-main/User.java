package com.company;

public abstract class User {
    private Validation validateSt;


    public User(Validation validateSt){
        this.validateSt = validateSt;
    }

   

    public void validate(){
        this.validateSt.val();
    }

    public abstract void display();
    public void setValidateSt(Validation validateSt){
        this.validateSt = validateSt;
    }
}
