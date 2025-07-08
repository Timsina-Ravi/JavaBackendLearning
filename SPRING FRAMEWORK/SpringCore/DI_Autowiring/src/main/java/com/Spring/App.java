package com.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
       DEV obj =context.getBean(DEV.class);
           obj.build();

               // though setter
//           System.out.println(obj.getAge());



    }
}
