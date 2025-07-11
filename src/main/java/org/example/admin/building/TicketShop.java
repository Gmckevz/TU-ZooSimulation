package org.example.admin.building;

public class TicketShop extends Shop{
    public void displayWelcomeMessage () {
        System.out.println("Here's what you can experience in the zoo:" +
                "Visit Animal Enclosures (Elephant, Lion, Owl)" +
                "Buy Snacks and Drinks from our Shops" +
                "Listen to science lectures at the Hospital" +
                "Buy fun gifts at our Gift Shop");
    }

    public void determinePriceOfTicket(int age) {
        if (age >= 0 && age <= 5) {
            System.out.println("You qualify for a CHILD");
        }
    }
}
