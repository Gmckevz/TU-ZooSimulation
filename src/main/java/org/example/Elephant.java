package org.example;

public class Elephant extends Pachyderm{

    void makeSound(){
        System.out.println("Elephant Toot");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Elephant eating");
    }
}
