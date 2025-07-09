package com.Learning.DI_Autowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DIApplication {

	public static void main(String[] args) {

		//   Don't Do this in SpringBoot
//-------------------------------------------------------------//
//    Basic java way(Manual Creation),
//    WE don't create objects like this in springBoot

//		Dev dv = new Dev();
//		dv.build();
		// ----------------------------------------------//

		//  ===============================================================//

		// 1. Dependency Injection

		// SpringApplication.run(...) creates the IoC container.
// ApplicationContext is used to access the beans inside it.
// (As long as classes are annotated, Spring automatically creates their objects)


		ApplicationContext context = SpringApplication.run(DIApplication.class, args);

   // Creating object using .getBean(ClassName.class)
		// to create this we need to add @Component
		// in class for which object is needed
		Dev obj = context.getBean(Dev.class);
		obj.build();


		//========================================================//

		// --------------------------------------------

		//    Multiple Beans for same type

		//   if u have 2 classes and have both @component
		// now if we use autowiring in both then compilers gets confused
		// and so, it throws  an error


		//  so to resolve this we should use  @Qualifier("bean Name")
		// can be used after @Component in any class or both  and solves the error




	}
}
