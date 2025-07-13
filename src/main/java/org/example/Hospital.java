package org.example;

import org.example.admin.Zoo;
import org.example.admin.building.BirdEnclosure;
import org.example.admin.building.FelineEnclosure;
import org.example.admin.building.PachydermEnclosure;

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

    public void viewSickAnimals() {
        System.out.println("Sick Animals Currently Admitted");

        if (sickAnimals.isEmpty()) {
            System.out.println("No Animals are Admitted");
        } else {
            for (Animal animal : sickAnimals) {
                System.out.println("-" + animal.getName());
            }
        }

    }

    public void viewHealAnimals(){
        System.out.println("Healed Animals with Timestamps");

        if (healedAnimals.isEmpty()) {
            System.out.println("No Animals are Healed");
        } else {
            for (int i = 0; i < healedAnimals.size(); i++) {
                System.out.println("-" + healedAnimals.get(i).getName() + " (" + dateTime.get(i) + ")");
            }
        }

    }

    public void attendScienceLecture(Zoo zoo) {
        System.out.println("Dr. " + zoo.getVet().getName() + " gives a science lecture on animal health and conservation.");
    }

    public void addSickAnimal(Animal animal, LocalDateTime admitDateTime) {
        sickAnimals.add(animal);
        dateTime.add(admitDateTime.toString());
    }

    public void returnHealedAnimalsToEnclosure(PachydermEnclosure pachydermEnclosure, FelineEnclosure felineEnclosure, BirdEnclosure birdEnclosure) {
        for (Animal animal: healedAnimals) {
            if (animal instanceof Pachyderm) {
                pachydermEnclosure.getAnimals().add(animal);
            } else if(animal instanceof Feline) {
                felineEnclosure.getAnimals().add(animal);
            } else {
                birdEnclosure.getAnimals().add(animal);
            }
        }

    }

    public ArrayList<Animal> getSickAnimals() {
        return sickAnimals;
    }

    public void setSickAnimals(ArrayList<Animal> sickAnimals) {
        this.sickAnimals = sickAnimals;
    }

    public ArrayList<Animal> getHealedAnimals() {
        return healedAnimals;
    }

    public void setHealedAnimals(ArrayList<Animal> healedAnimals) {
        this.healedAnimals = healedAnimals;
    }

    public ArrayList<String> getDateTime() {
        return dateTime;
    }

    public void setDateTime(ArrayList<String> dateTime) {
        this.dateTime = dateTime;
    }
}
