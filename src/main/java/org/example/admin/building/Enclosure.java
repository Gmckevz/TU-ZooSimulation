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
}
