package org.example.admin.people;

import org.example.admin.building.Shop;

import java.util.ArrayList;

public class Visitors extends People{
    private String ticketNumberAssigned;
    private ArrayList<Shop> productsCart;

    public Visitors() {
        productsCart = new ArrayList<>();
    }

    public void addSelectedItemToVisitorCart(Shop item) {
        System.out.println("Selected:");
        System.out.println(item.getProductName() + "(P" + item.getProductPrice() + ")");
        productsCart.add(item);
    }

    public void showTotalItemsInCart() {
        double totalPriceInCart = 0.0;
        System.out.println("Items in Cart:");
        for (Shop product: productsCart) {
            System.out.println(" -" + product.getProductName() + " (P" + product.getProductPrice() + ")");
            totalPriceInCart += product.getProductPrice();
        }

        System.out.println("Total: P" + totalPriceInCart);
    }

    public void resetCart() {
        productsCart.clear();
    }


    public String getTicketNumberAssigned() {
        return ticketNumberAssigned;
    }

    public void setTicketNumberAssigned(String ticketNumberAssigned) {
        this.ticketNumberAssigned = ticketNumberAssigned;
    }

    public ArrayList<Shop> getProductsCart() {
        return productsCart;
    }

    public void setProductsCart(ArrayList<Shop> productsCart) {
        this.productsCart = productsCart;
    }
}
