package org.example.admin.people;

import org.example.Animal;
import org.example.Hospital;
import org.example.admin.Zoo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Veterinarians extends People{
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);


    public void heal(Hospital hospital, Zoo zoo){
        System.out.println(zoo.getVet().getName() + " healing sick animals...");
        for (Animal animal : hospital.getSickAnimals()) {
            System.out.println("Healed:" + animal.getName() + "\n" + animal.getName() +" has been discharged and returned to enclosure.");
            hospital.getHealedAnimals().add(animal);
            hospital.getDateTime().add(formattedDateTime);
            animal.setHealthy(true);
            animal.setLocation("Enclosure");
        }
        hospital.getSickAnimals().clear();
    }
}
