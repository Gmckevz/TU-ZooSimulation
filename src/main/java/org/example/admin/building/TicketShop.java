package org.example.admin.building;

public class TicketShop extends Shop{

    private String ticketNumberPrefix = "ZOO-";
    private int number = 1000;

    public void displayWelcomeMessage () {
        System.out.println("=== WELCOME TO THE ZOO TICKET SHOP ===");
        System.out.println("Here's what you can experience in the zoo:" +
                " Visit Animal Enclosures (Elephant, Lion, Owl)" +
                " Buy Snacks and Drinks from our Shops" +
                " Listen to science lectures at the Hospital" +
                " Buy fun gifts at our Gift Shop");
    }

    public void determinePriceOfTicket(int age) {
        if (age >= 0 && age <= 5) {
            System.out.println("You qualify for a CHILD ticket");
            System.out.println("Ticket Price: Free!");
        } else if (age >= 6 && age <= 17) {
            System.out.println("You qualify for a STUDENT ticket");
            System.out.println("Ticket Price: P75.00");
        } else if (age >= 18 && age <= 59) {
            System.out.println("You qualify for a ADULT ticket");
            System.out.println("Ticket Price: P150.00");
        } else {
            System.out.println("You qualify for a SENIOR ticket");
            System.out.println("Ticket Price: P50.00");
        }
    }

    public String getTicketNumber() {
        return ticketNumberPrefix + number++;
    }

}
