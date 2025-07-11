package org.example;

public class Owl extends Bird{
    void makeSound(){
        System.out.println("Owl Toot");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Owl eating");
    }
}
