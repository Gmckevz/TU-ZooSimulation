package org.example.admin;

import java.util.ArrayList;
import java.util.Collections;

public class Zoo {
    private String managerName;
    private String vetName;
    private String pachydermHandler;
    private String felineHandler;
    private String birdHandler;
    private String ticketShopVendor;
    private String shopVendor;

    private final ArrayList<String> ticketNumbers = new ArrayList<>();

    public Zoo() {}

    public Zoo(String managerName, String vetName, String pachydermHandler, String felineHandler, String birdHandler, String ticketShopVendor, String shopVendor) {
        this.managerName = managerName;
        this.vetName = vetName;
        this.pachydermHandler = pachydermHandler;
        this.felineHandler = felineHandler;
        this.birdHandler = birdHandler;
        this.ticketShopVendor = ticketShopVendor;
        this.shopVendor = shopVendor;

        System.out.println("Zoo staff setup complete");
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

}
