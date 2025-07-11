package org.example;

public class Parrot extends Bird{
    void makeSound(){
        System.out.println("Parrot Toot");
    }

    @Override
    void eat() {
        super.eat();
        System.out.println("Parrot eating");
    }
}
