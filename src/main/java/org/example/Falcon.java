package org.example;

public class Falcon extends Bird{
    void makeSound(){
        System.out.println("Falcon Toot");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Falcon eating");
    }
}
