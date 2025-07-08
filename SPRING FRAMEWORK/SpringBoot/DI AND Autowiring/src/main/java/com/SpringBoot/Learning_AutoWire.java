package com.SpringBoot;

import org.springframework.stereotype.Component;

@Component   // this is used to tell IOC to create an object for this class
public class Learning_AutoWire {

    public void compile(){
        System.out.println("Compiling");
    }
}
