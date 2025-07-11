package org.example;

public class Lion extends Feline{

    void makeSound(){
        System.out.println("Lion Roar");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Lion eating");
    }
}
