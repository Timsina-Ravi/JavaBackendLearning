package com.Learning.DI_Autowiring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component          // tells SpringBoot to create object for this class (Bean)
public class Dev {

    // 1. Field Injection
    @Autowired      // used to connect dev class and Computer interface implementation (Laptop)
    private Computer com;     // we want to call compile() method of Laptop here

    /*
    // 2. Constructor Injection (preferred way)
    @Autowired
    public Dev(Computer com) {
        this.com = com;
    }
    */

    /*
    // 3. Setter Injection
    @Autowired
    public void setComputer(Computer com) {
        this.com = com;
    }
    */

    public void build(){
        System.out.println("Working on Awesome Project");
        com.compile();
    }
}
