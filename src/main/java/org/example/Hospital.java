package org.example;

import org.example.admin.Zoo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Hospital {

    private ArrayList<Animal> sickAnimals;
    private ArrayList<Animal> healedAnimals;
    private ArrayList<String> dateTime;

    public Hospital() {
        sickAnimals = new ArrayList<>();
        healedAnimals = new ArrayList<>();
        dateTime = new ArrayList<>();
    }

    Zoo zoo = new Zoo();

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);

    public void viewSickAnimals() {
        for (Animal animal : sickAnimals) {
            System.out.println("-" + animal.getName());
        }
    }

    public void viewHealAnimals(){
        for (Animal animal : healedAnimals) {
            System.out.println("-" + animal.getName());
        }
    }

    public void heal(){
        System.out.println(zoo.getVetName() + " healing sick animals...");
        for (Animal animal : sickAnimals) {
            System.out.println("Healed:" + animal.getName() + "\n" + animal.getName() +" has been discharged and returned to enclosure.");
            healedAnimals.add(animal);
            dateTime.add(formattedDateTime);
            animal.setHealthy(true);
        }
        sickAnimals.clear();
    }

    public void attendScienceLecture() {
        System.out.println(zoo.getVetName() + " gives a science lecture on animal health and conservation.");
    }

    public void exitZoo(){
        System.out.println("Exiting Zoo Vet Hospital. Goodbye!");
    }

    public void addSickAnimal(Animal animal, LocalDateTime admitDateTime) {
        sickAnimals.add(animal);
        dateTime.add(admitDateTime.toString());
    }

}
