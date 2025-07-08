package com.SpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//======================================
//LEARNED DI AND AUTOWIRING WITH SPRINGBBOT
//========================================

@Component   // this is used to tell IOC to create an object for this class to use as DI
public class Learning_DI {

       //  field injection  1  (use one only)
    // Learning Autowiring... this is a field injection .. a type of DI
    @Autowired  // this is needed to connect both classes only @Component is used to get objects..
               Learning_AutoWire autoWire;


//    // constructor injection 2  (use one only)
//    // if not using @AutoWired ... Using constructor injection
//    public Learning_DI(Learning_AutoWire autoWire){
//        this.autoWire=autoWire;
//    }

//   // setter injection 3 (use one only)
//  @Autowired     // we need to use autowire in setter injection to run
//    public void setAutoWire(Learning_AutoWire autoWire){
//        this.autoWire=autoWire;
//    }


    public void code(){
        System.out.println("coding");


        // Learning Autowiring
        autoWire.compile();
    }
}
