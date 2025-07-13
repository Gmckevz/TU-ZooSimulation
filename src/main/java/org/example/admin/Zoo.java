package org.example.admin;

import org.example.admin.building.Shop;
import org.example.admin.people.Handler;
import org.example.admin.people.Managers;
import org.example.admin.people.Vendors;
import org.example.admin.people.Veterinarians;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    // ADMIN CREDENTIALS
    private String ADMIN_USERNAME = "admin";
    private String PASSWORD = "adminadmin";
    private boolean isAdminLoggedIn = false;
    // ADMIN CREDENTIALS

    // Zoo Staff Details
    private Managers manager;
    private Veterinarians vet;
    private Handler pachydermHandler;
    private Handler felineHandler;
    private Handler birdHandler;
    private Vendors ticketShopVendor;
    private Vendors shopVendor;

    // Ticket Numbers List
    private final ArrayList<String> ticketNumbers = new ArrayList<>();

    // Zoo open or closed
    private boolean isZooOpen = false;

    // Zoo Products
    private ArrayList<Shop> products = new ArrayList<>();

    public Zoo() {
        this.manager = new Managers();
        this.vet = new Veterinarians();
        this.pachydermHandler = new Handler();
        this.felineHandler = new Handler();
        this.birdHandler = new Handler();
        this.ticketShopVendor = new Vendors();
        this.shopVendor = new Vendors();
    }

    public boolean validateTicket(String ticketNumber) {
        boolean isTicketValid = false;

        for (String ticket: ticketNumbers) {
            if (ticket.equalsIgnoreCase(ticketNumber)){
                isTicketValid = true;
                break;
            }
        }

        return isTicketValid;
    }

    public void addTicketToSystem(String ticketNumber) {
        this.ticketNumbers.add(ticketNumber);
        System.out.println("[Ticket added to System]");
    }

    public boolean validateAdminUser(String username, String password) {
        if (username.equals(ADMIN_USERNAME) && password.equals(PASSWORD)) {
            isAdminLoggedIn = true;
            return true;
        } else {
            return false;
        }
    }

    public boolean isAdminUserLoggedIn() {
        return isAdminLoggedIn;
    }

    public void logoutAdmin(){
        isAdminLoggedIn = false;
    }

    public void populateZooSetupDetails() {
        Scanner inputReader = new Scanner(System.in);

        System.out.println("--- Zoo Setup ---");
        System.out.print("Enter your name, Manager: ");
        this.manager.setName(inputReader.nextLine());
        System.out.print("Enter Veterinarian's Name: ");
        this.vet.setName(inputReader.nextLine());
        System.out.print("Enter Handler for Pachyderm Enclosure: ");
        this.pachydermHandler.setName(inputReader.nextLine());
        System.out.print("Enter Handler for Feline Enclosure: ");
        this.felineHandler.setName(inputReader.nextLine());
        System.out.print("Enter Handler for Bird Enclosure: ");
        this.birdHandler.setName(inputReader.nextLine());
        System.out.print("Enter Vendor for Ticket Shop: ");
        this.ticketShopVendor.setName(inputReader.nextLine());
        System.out.print("Enter Vendor for Shop: ");
        this.shopVendor.setName(inputReader.nextLine());

        System.out.println("Zoo staff setup complete");
    }

    public void addProductForDisplay (Shop item) {
        products.add(item);
    }

    public void displayProducts() {
        System.out.println("Available Products:");
        for (int i = 0; i < products.size(); i++) {
            System.out.println(i + 1 + ". " + products.get(i).getProductName() + " - P" + products.get(i).getProductPrice());
        }
    }

    public Shop getProductItemByIndex(int index) {
        return products.get(index - 1);
    }


    public Managers getManager() {
        return manager;
    }

    public void setManagerName(String managerName) {
        this.manager.setName(managerName);
    }

    public Veterinarians getVet() {
        return vet;
    }

    public void setVetName(String vetName) {
        this.vet.setName(vetName);
    }

    public Handler getPachydermHandler() {
        return pachydermHandler;
    }

    public void setPachydermHandler(String pachydermHandler) {
        this.pachydermHandler.setName(pachydermHandler);
    }

    public Handler getFelineHandler() {
        return felineHandler;
    }

    public void setFelineHandler(String felineHandler) {
        this.felineHandler.setName(felineHandler);
    }

    public Handler getBirdHandler() {
        return birdHandler;
    }

    public void setBirdHandler(String birdHandler) {
        this.birdHandler.setName(birdHandler);
    }

    public Vendors getTicketShopVendor() {
        return ticketShopVendor;
    }

    public void setTicketShopVendor(String ticketShopVendor) {
        this.ticketShopVendor.setName(ticketShopVendor);
    }

    public Vendors getShopVendor() {
        return shopVendor;
    }

    public void setShopVendor(String shopVendor) {
        this.shopVendor.setName(shopVendor);
    }

    public ArrayList<String> getTicketNumber() {
        return ticketNumbers;
    }

    public boolean isZooOpen() {
        return isZooOpen;
    }

    public void setZooOpen(boolean zooOpen) {
        isZooOpen = zooOpen;
    }
}
