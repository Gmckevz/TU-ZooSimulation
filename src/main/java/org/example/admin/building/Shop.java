package org.example.admin.building;

import org.example.admin.Zoo;

import java.util.ArrayList;

public class Shop extends Building{
    private String productName;
    private double productPrice;

    public Shop() {
    }

    public void checkout(ArrayList<Shop> products){
        System.out.println("Payment Successful!");
        System.out.println("Receipt:");

        double totalPaid = 0.0;

        for (Shop product: products) {
            System.out.println("- " + product.productName + " : " + product.productPrice);
            totalPaid += product.productPrice;
        }

        System.out.println("Total Paid: P" + totalPaid);
    }

    public void checkout(String ticketCode, Zoo zooInstance) {
        System.out.println("Ticket Purchased!");
        System.out.println("Your ticket code is: " + ticketCode);

        zooInstance.addTicketToSystem(ticketCode);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

}
