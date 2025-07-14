package org.example.admin.people;

import org.example.Animal;
import org.example.Hospital;
import org.example.admin.building.Enclosure;
import org.example.admin.building.FelineEnclosure;

import java.time.LocalDateTime;

public class Handler extends People {
    private boolean isDoneFeeding = false;
    private boolean isDoneExecising = false;
    private boolean isDoneExamining = false;
    private boolean changesOccured;

    LocalDateTime dataTime = LocalDateTime.now();

    public Handler() {}

    public void feed(Animal animal) {
        System.out.println("Feeding " + animal.getName());
        isDoneFeeding = true;
    }

    public void exercise(Animal animal) {
        System.out.println("Exercising " + animal.getName());
        isDoneExecising = true;
    }

    public void examine(Animal animal, Hospital hospital, Enclosure enclosure) {
        changesOccured = false;
        System.out.println("Examining " + animal.getName());
        if (!animal.isHealthy()){
            hospital.addSickAnimal(animal, dataTime);
            animal.setLocation("Hospital");

            System.out.println("Sending to Hospital...");
            System.out.println(animal.getName() + " admitted at " + dataTime);

            animal.setAnimalSentToHospital(true);
            enclosure.getAnimals().remove(animal);
        } else {
            System.out.println(animal.getName() + " is healthy!");
            System.out.println();
        }
    }

    public boolean isDoneFeeding() {
        return isDoneFeeding;
    }

    public void setDoneFeeding(boolean doneFeeding) {
        isDoneFeeding = doneFeeding;
    }

    public boolean isDoneExecising() {
        return isDoneExecising;
    }

    public void setDoneExecising(boolean doneExecising) {
        isDoneExecising = doneExecising;
    }

    public boolean isDoneExamining() {
        return isDoneExamining;
    }

    public void setDoneExamining(boolean doneExamining) {
        isDoneExamining = doneExamining;
    }
}
