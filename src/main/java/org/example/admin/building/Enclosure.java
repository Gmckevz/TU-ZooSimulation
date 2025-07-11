package org.example.admin.building;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Enclosure extends Building{
    private ArrayList<String> animals;

    public ArrayList<String> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<String> animals) {
        this.animals = animals;
    }

    public void sendToHospital(int index) {
        LocalDateTime currentDateTime = LocalDateTime.now();

        System.out.println("Sending to Hospital...");
        System.out.println(animals.get(index) + " admitted at " + currentDateTime);
    }
}
