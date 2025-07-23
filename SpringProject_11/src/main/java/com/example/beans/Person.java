package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
//	@Autowired
//    private String name="Lucy";   // field injection

	private String name="Lucy";
//	private final Vehicle vehicle; //only final for constructor injection
    @Autowired
    public Person(Vehicle vehicle){
        System.out.println("Person bean created by Spring");  // construtcor injection
        this.vehicle = vehicle;
    }

    /*
    The @Autowired annotation marks on a field, constructor, Setter method
    is used to auto-wire the beans that is ‘injecting beans'(Objects) at runtime
    by Spring Dependency Injection mechanism
    * */
    /*@Autowired*/
    private Vehicle vehicle;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    /*@Autowired*/                                        // setter injection
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

}
