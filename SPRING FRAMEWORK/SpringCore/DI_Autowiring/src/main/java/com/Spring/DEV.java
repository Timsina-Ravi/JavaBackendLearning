package com.Spring;

public class DEV {
    private computer com;


//  int age;
//    constructor di----
//    public DEV(int age){
//        this.age=age;
//        System.out.println("Through Constructor ");
//    }
    // Setter di----
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }


    public DEV(){
        System.out.println("Dev Constructor");
    }

    public computer getCom() {
        return com;
    }

    public void setCom(computer com) {
        this.com = com;
    }

    public void build(){
        System.out.println("Building");
        com.compile();
    }
}
