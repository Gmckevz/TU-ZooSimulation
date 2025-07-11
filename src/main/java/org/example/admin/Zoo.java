package org.example.admin;

import java.util.ArrayList;

public class Zoo {
    // ADMIN CREDENTIALS
    private String ADMIN_USERNAME = "admin";
    private String PASSWORD = "adminadmin";
    private boolean isAdminLoggedIn = false;
    // ADMIN CREDENTIALS

    // Zoo Staff Details
    private String managerName;
    private String vetName;
    private String pachydermHandler;
    private String felineHandler;
    private String birdHandler;
    private String ticketShopVendor;
    private String shopVendor;

    // Ticket Numbers List
    private final ArrayList<String> ticketNumbers = new ArrayList<>();

    // Zoo open or closed
    private boolean isZooOpen = false;

    public Zoo() {}

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

    public void populateZooSetupDetails(String managerName, String vetName, String pachydermHandler, String felineHandler, String birdHandler, String ticketShopVendor, String shopVendor) {
        this.managerName = managerName;
        this.vetName = vetName;
        this.pachydermHandler = pachydermHandler;
        this.felineHandler = felineHandler;
        this.birdHandler = birdHandler;
        this.ticketShopVendor = ticketShopVendor;
        this.shopVendor = shopVendor;

        System.out.println("Zoo staff setup complete");
    }


    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getPachydermHandler() {
        return pachydermHandler;
    }

    public void setPachydermHandler(String pachydermHandler) {
        this.pachydermHandler = pachydermHandler;
    }

    public String getFelineHandler() {
        return felineHandler;
    }

    public void setFelineHandler(String felineHandler) {
        this.felineHandler = felineHandler;
    }

    public String getBirdHandler() {
        return birdHandler;
    }

    public void setBirdHandler(String birdHandler) {
        this.birdHandler = birdHandler;
    }

    public String getTicketShopVendor() {
        return ticketShopVendor;
    }

    public void setTicketShopVendor(String ticketShopVendor) {
        this.ticketShopVendor = ticketShopVendor;
    }

    public String getShopVendor() {
        return shopVendor;
    }

    public void setShopVendor(String shopVendor) {
        this.shopVendor = shopVendor;
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
