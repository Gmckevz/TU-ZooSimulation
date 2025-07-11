package org.example;

import org.example.admin.Zoo;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Hospital {

    private ArrayList<String> sickAnimals;
    private ArrayList<String> healedAnimals;
    private ArrayList<String> dateTime;

    Zoo zoo = new Zoo();

    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);

    void viewSickAnimals() {
        sickAnimals = new ArrayList<>();
        for (String animal : sickAnimals) {
            System.out.println("-" + animal);
        }
    }

    void viewHealAnimals(){
        for (String animal : healedAnimals) {
            System.out.println("-" + animal);
        }
    }

    void heal(){
        healedAnimals = new ArrayList<>();
        dateTime = new ArrayList<>();
        System.out.println(zoo.getVetName() + " healing sick animals...");
        for (String animal : sickAnimals) {
            System.out.println("Healed:" + animal + "\n" + animal +" has been discharged and returned to enclosure.");
            healedAnimals.add(animal);
            dateTime.add(formattedDateTime);
        }
        sickAnimals.clear();
    }

    void attendScienceLecture() {
        System.out.println(zoo.getVetName() + " gives a science lecture on animal health and conservation.");
    }

    void exitZoo(){
        System.out.println("Exiting Zoo Vet Hospital. Goodbye!");
    }

}
