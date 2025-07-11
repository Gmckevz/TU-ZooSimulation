package org.example;

public class Cheetah extends Feline{

    void makeSound(){
        System.out.println("Cheetah -----");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Cheetah eating");
    }
}
