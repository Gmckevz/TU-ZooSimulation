package org.example;

public abstract class Animal {

    private String name;
    private boolean isHealthy;
    private String location;
    private boolean isAnimalSentToHospital;

    Animal() {

    }
    public Animal(String name, boolean isHealthy, String location) {
        this.name = name;
        this.isHealthy = isHealthy;
        this.location = location;
        this.isAnimalSentToHospital = false;
    }

    abstract void eat();
    abstract void sleep();
    abstract void roam();

    public boolean isHealthy() {
        return isHealthy;
    }

    public void setHealthy(boolean healthy) {
        isHealthy = healthy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAnimalSentToHospital() {
        return isAnimalSentToHospital;
    }

    public void setAnimalSentToHospital(boolean animalSentToHospital) {
        isAnimalSentToHospital = animalSentToHospital;
    }
}
