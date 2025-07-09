package com.Learning.DI_Autowiring;

import org.springframework.stereotype.Component;

@Component   // tell SpringBoot to create object for this class (Bean)
public class Laptop implements Computer {

    public void compile(){
        System.out.println("Compiling");
    }
}
