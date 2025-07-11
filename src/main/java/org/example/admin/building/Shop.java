package org.example.admin.building;

import org.example.admin.Zoo;

import java.util.ArrayList;

public class Shop extends Building{

    public void checkout(ArrayList<String> productsName, ArrayList<Double> productsPrice){
        System.out.println("Payment Successful!");
        System.out.println("Receipt:");

        double totalPaid = 0.0;

        for (int i = 0; i < productsName.size(); i++) {
            System.out.println("- " + productsName.get(i) + " : " + productsPrice.get(i));
            totalPaid += productsPrice.get(i);
        }

        System.out.println("Total Paid: P" + totalPaid);
    }

    public void checkout(String ticketCode, Zoo zooInstance) {
        System.out.println("Ticket Purchased!");
        System.out.println("Your ticket code is: " + ticketCode);

        zooInstance.addTicketToSystem(ticketCode);
    }

}
