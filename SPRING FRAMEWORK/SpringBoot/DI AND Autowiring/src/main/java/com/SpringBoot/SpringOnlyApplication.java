package com.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringOnlyApplication {

	public static void main(String[] args) {
// for DI we Added ---   	ApplicationContext context= // to use this object for cearting object automatically
	ApplicationContext context= SpringApplication.run(SpringOnlyApplication.class, args);


//		// Calling method withOut springBoot or DI BY Creating object manually
//		Learning_DI obj = new Learning_DI();
//		obj.code();


		// NOw with spring
		Learning_DI obj = context.getBean(Learning_DI.class);
		obj.code();




	}

}
