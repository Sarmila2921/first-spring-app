package com.firstspringbootapp.example.first_spring_app;

import com.firstspringbootapp.example.first_spring_app.model.Address;
import com.firstspringbootapp.example.first_spring_app.model.Employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstSpringAppApplication {

	public static void main(String[] args) {

        SpringApplication.run(FirstSpringAppApplication.class, args);

        //tight coupling
//        Employee emp1=new Employee();
//        emp1.id=7;
//        emp1.name="MSD";
//        emp1.email="msd7@gmail.com";
//        emp1.designation="developer";
//
//        Address adrs1= new Address();
//        adrs1.doorNo=17;
//        adrs1.streetName="Salem";
//        adrs1.city="Tamil Nadu";
//
//        emp1.address=adrs1;
//
//        System.out.println("emp1 is:" + emp1);
//        System.out.println("adrs1 is:"+adrs1);
//
//        adrs1.doorNo=7777;
//        adrs1.streetName="Chennai";
//        adrs1.city="Tamil Nadu";
//
//        System.out.println("emp1 after change adrs1 is:" + emp1);
//        System.out.println("adrs1 after change adrs1 is:"+adrs1);


        //dependencey injection - loose coupling with setter injection
        Employee emp2=new Employee();
        emp2.setId(707);
        emp2.setName("Arudhra");
        emp2.setEmail("arudhara29@gmail.com");
        emp2.setDesignation("Software Engineer");

        Address adrs2 = new Address();
        adrs2.setDoorNo(22);
        adrs2.setStreetName("Elampillai");
        adrs2.setCity("Salem");

        emp2.setAddress(adrs2);

        System.out.println("emp2 is :"+emp2);
        System.out.println("adrs2 is:"+adrs2);

// change address using emp object
        emp2.getAddress().setDoorNo(77777);
        emp2.getAddress().setStreetName("New city");
        emp2.getAddress().setCity("New city");

        System.out.println("emp2 after adrs2 is :"+emp2);
        System.out.println("adrs2 after adrs2 is:"+adrs2);


	}

}
