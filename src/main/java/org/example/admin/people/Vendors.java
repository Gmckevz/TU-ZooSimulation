package org.example.admin.people;

import org.example.admin.Zoo;
import org.example.admin.building.Shop;

import java.util.ArrayList;

public class Vendors extends People{
    public Vendors() {}

    public void sell(ArrayList<Shop> visitorProductCart) {
        Shop shopCheckout = new Shop();
        shopCheckout.checkout(visitorProductCart);
    }

    public void sell(String ticketCode, Zoo zooInstance) {
        Shop shopCheckout = new Shop();
        shopCheckout.checkout(ticketCode, zooInstance);
    }

}
