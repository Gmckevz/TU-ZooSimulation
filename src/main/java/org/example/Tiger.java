package org.example;

public class Tiger extends Feline{
    void makeSound(){
        System.out.println("Tiger ----");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Tiger eating");
    }
}
