package org.example.admin.people;

public class Managers extends People{

    public Managers() {
    }

    public boolean openZoo() {
        System.out.println("Opening Zoo");
        return true;
    }

    public boolean closeZoo() {
        System.out.println("Closing Zoo");
        return false;
    }


}
