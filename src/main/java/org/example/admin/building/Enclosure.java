package org.example.admin.building;

import org.example.Animal;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Enclosure extends Building{
    private ArrayList<Animal> animals = new ArrayList<>();

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void sendToHospital(int index) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Sending to Hospital...");
        System.out.println(animals.get(index) + " admitted at " + currentDateTime);
    }
}
