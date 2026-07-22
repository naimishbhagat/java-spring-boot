package org.naimish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("21")
    private int age;
    @Autowired
    @Qualifier("desktop")
    private Computer computer;
    public Alien(){
       // System.out.println("Object Created");
    }

//    public Alien(int age, Computer computer) {
//        this.age = age;
//        this.computer = computer;
//    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setter called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
        computer.compile();
    }

}
