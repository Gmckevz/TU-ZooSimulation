package org.example;

public abstract class Animal {

    private String name;
    private boolean isHealthy;
    private String location;

    Animal() {

    }
    public Animal(String name, boolean isHealthy, String location) {
        this.name = name;
        this.isHealthy = isHealthy;
        this.location = location;
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
}
