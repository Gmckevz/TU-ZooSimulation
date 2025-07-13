package org.example;

import org.example.admin.Zoo;
import org.example.admin.building.*;
import org.example.admin.people.*;

import java.util.Scanner;


public class ZooMain {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int choice = 0;

        // declare zoo object
        Zoo zooInstance = new Zoo();

        // declare hospital object
        Hospital hospitalInstance = new Hospital();

        // populate animals in the enclosures
        PachydermEnclosure pachydermEnclosure = new PachydermEnclosure();
        FelineEnclosure felineEnclosure = new FelineEnclosure();
        BirdEnclosure birdEnclosure = new BirdEnclosure();

        // populate test animals
        Lion mufasa = new Lion();
        mufasa.setName("Mufasa");
        mufasa.setHealthy(false);
        mufasa.setLocation("Enclosure");
        felineEnclosure.setAnimal(mufasa);

        Lion simba = new Lion();
        simba.setName("Simba");
        simba.setHealthy(true);
        simba.setLocation("Enclosure");
        felineEnclosure.setAnimal(simba);

        Elephant dumbo = new Elephant();
        dumbo.setName("Dumbo");
        dumbo.setHealthy(false);
        dumbo.setLocation("Enclosure");
        pachydermEnclosure.setAnimal(dumbo);

        Rhino rinno = new Rhino();
        rinno.setName("Rinno");
        rinno.setHealthy(true);
        rinno.setLocation("Enclosure");
        pachydermEnclosure.setAnimal(rinno);

        Parrot parro = new Parrot();
        parro.setName("Parro");
        parro.setHealthy(false);
        parro.setLocation("Enclosure");
        birdEnclosure.setAnimal(parro);

        Falcon falco = new Falcon();
        falco.setName("Falco");
        falco.setHealthy(true);
        falco.setLocation("Enclosure");
        birdEnclosure.setAnimal(falco);

        // populate zoo test products;
        Drinks softDrinks = new Drinks();
        softDrinks.setProductName("Soft Drinks");
        softDrinks.setProductPrice(30.00);

        Foods popcorn = new Foods();
        popcorn.setProductName("Popcorn");
        popcorn.setProductPrice(50.00);

        Gifts plushToy = new Gifts();
        plushToy.setProductName("Plush Toy");
        plushToy.setProductPrice(120.00);

        Gifts keyChain = new Gifts();
        keyChain.setProductName("Keychain");
        keyChain.setProductPrice(45.00);

        zooInstance.addProductForDisplay(softDrinks);
        zooInstance.addProductForDisplay(popcorn);
        zooInstance.addProductForDisplay(plushToy);
        zooInstance.addProductForDisplay(keyChain);

        while(choice != 3) {
            // zoo console, choose if you are accessing as an admin or visitor
            System.out.println("------Welcome to the Zoo------");
            System.out.println("What would you like to access?");
            System.out.println("1. Zoo Admin Console ");
            System.out.println("2. The Zoo");
            System.out.println("3. Exit Program");
            System.out.print("Enter your choice: ");
            choice = inputReader.nextInt();

            switch (choice) {
                case 1:
                    // add new line
                    System.out.println();
                    System.out.println("=== Welcome to the Zoo Admin Console ===");
                    // add new line
                    System.out.println();
                    System.out.println("Please log in.");
                    System.out.print("Enter username: ");
                    String username = inputReader.next();
                    System.out.print("Enter password: ");
                    String password = inputReader.next();


                    // validate if username and password is valid
                    zooInstance.validateAdminUser(username,password);

                    if (zooInstance.isAdminUserLoggedIn()) {
                        // declare manager object
                        Managers manager = zooInstance.getManager();

                        System.out.println("Login successful. Welcome!");
                        int adminDashboardChoice = 0;

                        if (manager.getName() == null) {
                            System.out.println("========= ZOO ADMIN MAIN MENU =========");
                            System.out.println("1. Setup Zoo Staff");
                            System.out.println("2. Exit ");
                            System.out.print("Choose an option: ");
                            adminDashboardChoice = inputReader.nextInt();

                            if (adminDashboardChoice == 1) {
                                zooInstance.populateZooSetupDetails();
                            } else if (adminDashboardChoice == 2) {
                                break;
                            } else {
                                System.out.println("Invalid input, try again.");
                            }
                        } else {
                            while (adminDashboardChoice != 5) {
                                System.out.println("========= ZOO ADMIN MAIN MENU =========");
                                System.out.println("1. Setup Zoo Staff");
                                System.out.println("2. Access Handler Module");
                                System.out.println("3. Open Zoo to Visitors");
                                System.out.println("4. Close Zoo to Visitors");
                                System.out.println("5. Exit");
                                System.out.print("Choose an option: ");
                                adminDashboardChoice = inputReader.nextInt();

                                switch (adminDashboardChoice) {
                                    case 1:
                                        zooInstance.populateZooSetupDetails();
                                        break;

                                    case 2:
                                        int animalDutyMenuChoice = -1;
                                        boolean isHandlerDoneWithTasks = false;

                                        System.out.print("Enter your name (Handler): ");
                                        String handler = inputReader.next();

                                        if (handler.equals(zooInstance.getFelineHandler().getName())) {
                                            Handler felineHandler = zooInstance.getFelineHandler();
                                            felineHandler.setName(zooInstance.getFelineHandler().getName());

                                            System.out.println("Welcome, Handler " + felineHandler.getName());
                                            while (animalDutyMenuChoice != 0) {
                                                System.out.println("--- Animal Duty Menu ---");
                                                System.out.println(felineEnclosure.getAnimals().isEmpty() ? "No Animals assigned to you" : "Animals assigned to you:");

                                                // displays the list of animals within the feline enclosure
                                                for (int i = 0; i < felineEnclosure.getAnimals().size(); i++) {
                                                    System.out.println(i + 1 + ". " + felineEnclosure.getAnimals().get(i).getName());
                                                }

                                                // add new line
                                                System.out.println();
                                                System.out.print("Choose animal number to interact with (0 to exit): ");
                                                animalDutyMenuChoice = inputReader.nextInt();

                                                if (animalDutyMenuChoice == 0) {
                                                    System.out.println("Finished duties for the day.");
                                                } else {
                                                    if (animalDutyMenuChoice <= felineEnclosure.getAnimals().size()) {

                                                        System.out.println("Choose Action:");
                                                        System.out.println("1. Feed " + felineEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName());
                                                        System.out.println("2. Exercise " + felineEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName());
                                                        System.out.println("3. Examine " + felineEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName() + " to Vet");
                                                        System.out.print("Choose an option: ");
                                                        int actionChoice = inputReader.nextInt();

                                                        switch (actionChoice) {
                                                            case 1:
                                                                felineHandler.feed(felineEnclosure.getAnimals().get(animalDutyMenuChoice - 1));
                                                                break;

                                                            case 2:
                                                                felineHandler.exercise(felineEnclosure.getAnimals().get(animalDutyMenuChoice - 1));
                                                                break;

                                                            case 3:
                                                                felineHandler.examine(felineEnclosure.getAnimals().get(animalDutyMenuChoice - 1), hospitalInstance, felineEnclosure);
                                                                break;

                                                            default:
                                                                System.out.println("Invalid Input, try again.");
                                                                break;
                                                        }

                                                    }
                                                }
                                            }
                                        } else if (handler.equals(zooInstance.getPachydermHandler().getName())) {
                                            Handler pachydermHandler = zooInstance.getPachydermHandler();
                                            pachydermHandler.setName(zooInstance.getPachydermHandler().getName());

                                            System.out.println("Welcome, Handler " + pachydermHandler.getName());
                                            while (animalDutyMenuChoice != 0) {
                                                System.out.println("--- Animal Duty Menu ---");
                                                System.out.println(pachydermEnclosure.getAnimals().isEmpty() ? "No Animals assigned to you" : "Animals assigned to you:");

                                                // displays the list of animals within the pachyderm enclosure
                                                for (int i = 0; i < pachydermEnclosure.getAnimals().size(); i++) {
                                                    System.out.println(i + 1 + ". " + pachydermEnclosure.getAnimals().get(i).getName());
                                                }

                                                // add new line
                                                System.out.println();
                                                System.out.print("Choose animal number to interact with (0 to exit): ");
                                                animalDutyMenuChoice = inputReader.nextInt();

                                                if (animalDutyMenuChoice == 0) {
                                                    System.out.println("Finished duties for the day.");
                                                } else {
                                                    if (animalDutyMenuChoice <= pachydermEnclosure.getAnimals().size()) {

                                                        System.out.println("Choose Action:");
                                                        System.out.println("1. Feed " + pachydermEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName());
                                                        System.out.println("2. Exercise " + pachydermEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName());
                                                        System.out.println("3. Examine " + pachydermEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName() + " to Vet");
                                                        System.out.print("Choose an option: ");
                                                        int actionChoice = inputReader.nextInt();

                                                        switch (actionChoice) {
                                                            case 1:
                                                                pachydermHandler.feed(pachydermEnclosure.getAnimals().get(animalDutyMenuChoice - 1));
                                                                break;

                                                            case 2:
                                                                pachydermHandler.exercise(pachydermEnclosure.getAnimals().get(animalDutyMenuChoice - 1));
                                                                break;

                                                            case 3:
                                                                pachydermHandler.examine(pachydermEnclosure.getAnimals().get(animalDutyMenuChoice - 1), hospitalInstance, pachydermEnclosure);
                                                                break;

                                                            default:
                                                                System.out.println("Invalid Input, try again.");
                                                                break;
                                                        }

                                                    }
                                                }
                                            }
                                        } else if (handler.equals(zooInstance.getBirdHandler().getName())) {
                                            Handler birdHandler = zooInstance.getBirdHandler();
                                            birdHandler.setName(zooInstance.getBirdHandler().getName());

                                            System.out.println("Welcome, Handler " + birdHandler.getName());
                                            while (animalDutyMenuChoice != 0) {
                                                System.out.println("--- Animal Duty Menu ---");
                                                System.out.println(birdEnclosure.getAnimals().isEmpty() ? "No Animals assigned to you" : "Animals assigned to you:");

                                                // displays the list of animals within the pachyderm enclosure
                                                for (int i = 0; i < birdEnclosure.getAnimals().size(); i++) {
                                                    System.out.println(i + 1 + ". " + birdEnclosure.getAnimals().get(i).getName());
                                                }

                                                // add new line
                                                System.out.println();
                                                System.out.print("Choose animal number to interact with (0 to exit): ");
                                                animalDutyMenuChoice = inputReader.nextInt();

                                                if (animalDutyMenuChoice == 0) {
                                                    System.out.println("Finished duties for the day.");
                                                } else {
                                                    if (animalDutyMenuChoice <= birdEnclosure.getAnimals().size()) {

                                                        System.out.println("Choose Action:");
                                                        System.out.println("1. Feed " + birdEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName());
                                                        System.out.println("2. Exercise " + birdEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName());
                                                        System.out.println("3. Examine " + birdEnclosure.getAnimals().get(animalDutyMenuChoice - 1).getName() + " to Vet");
                                                        System.out.print("Choose an option: ");
                                                        int actionChoice = inputReader.nextInt();

                                                        switch (actionChoice) {
                                                            case 1:
                                                                birdHandler.feed(birdEnclosure.getAnimals().get(animalDutyMenuChoice - 1));
                                                                break;

                                                            case 2:
                                                                birdHandler.exercise(birdEnclosure.getAnimals().get(animalDutyMenuChoice - 1));
                                                                break;

                                                            case 3:
                                                                birdHandler.examine(birdEnclosure.getAnimals().get(animalDutyMenuChoice - 1), hospitalInstance, birdEnclosure);
                                                                break;

                                                            default:
                                                                System.out.println("Invalid Input, try again.");
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            System.out.println("Handler not found!");
                                        }
                                        break;

                                    case 3:
                                        zooInstance.setZooOpen(manager.openZoo());
                                        adminDashboardChoice = 5;
                                        break;

                                    case 4:
                                        zooInstance.setZooOpen(manager.closeZoo());
                                        adminDashboardChoice = 5;
                                        break;

                                    case 5:
                                        System.out.println("Closing Zoo Admin Console");
                                        // add new line
                                        System.out.println();
                                        break;

                                    default:
                                        System.out.println("Invalid Input, try again!");
                                        // add new line
                                        System.out.println();
                                        break;
                                }
                            }
                        }
                    } else {
                        System.out.println("Access Denied!");
                    }

                    // add new line
                    System.out.println();
                    break;

                case 2:
                    if (zooInstance.isZooOpen()) {
                        Visitors visitor = new Visitors();
                        Tickets ticket = new Tickets();
                        ticket.displayWelcomeMessage();
                        int zooVisitorChoice = 0;

                        while (zooVisitorChoice != 3) {
                            System.out.println("1. Buy Ticket");
                            System.out.println("2. Enter Existing Ticket Number");
                            System.out.println("3. Exit Zoo");
                            System.out.print("Enter Choice: ");
                            zooVisitorChoice = inputReader.nextInt();

                            switch (zooVisitorChoice) {
                                case 1:
                                    System.out.print("Enter your name: ");
                                    String nameForTicket = inputReader.next();
                                    System.out.print("Enter your age: ");
                                    int age = inputReader.nextInt();

                                    ticket.determinePriceOfTicket(age);

                                    System.out.print("Proceed with purchase? (yes/no): ");
                                    String checkoutChoice = inputReader.next();

                                    if (checkoutChoice.equalsIgnoreCase("yes")) {
                                        String ticketNumber = ticket.getTicketNumber();
                                        ticket.checkout(ticketNumber, zooInstance);
                                        visitor.setTicketNumberAssigned(ticketNumber);
                                        visitor.setName(nameForTicket);

                                        System.out.println("Ticket Purchased!");
                                        System.out.println("Your ticket code is: " + ticketNumber);
                                        System.out.println("Please enter your ticket number to enter the zoo.");
                                    }
                                    break;

                                case 2:
                                    System.out.print("Enter your ticket number: ");
                                    String existingTicketNumber = inputReader.next();
                                    if(zooInstance.validateTicket(existingTicketNumber)) {
                                        // zoo visitor menu
                                        int visitorMenuChoice = 0;

                                        while (visitorMenuChoice != 4) {
                                            System.out.println("Welcome to the Zoo!");
                                            System.out.println("What would you like to do?");
                                            System.out.println("1. Visit Enclosure");
                                            System.out.println("2. Visit Shop");
                                            System.out.println("3. Visit Hospital");
                                            System.out.println("4. Leave Zoo");
                                            System.out.print("Choose an option: ");
                                            visitorMenuChoice = inputReader.nextInt();

                                            switch (visitorMenuChoice) {
                                                case 1:
                                                    System.out.println("=== Zoo Enclosure ===");
                                                    System.out.println("Choose Enclosure:");
                                                    System.out.println("1. Pachyderm (Elephant)");
                                                    System.out.println("2. Feline (Lion)");
                                                    System.out.println("3. Bird (Owl)");
                                                    System.out.print("Choose an option: ");
                                                    int zooEnclosureChoice = inputReader.nextInt();

                                                    String feedChoice;

                                                    switch (zooEnclosureChoice) {
                                                        case 1:
                                                            Elephant elephant = new Elephant();
                                                            System.out.print("Would you like to feed the Elephant? (yes/no): ");
                                                            feedChoice = inputReader.next();

                                                            if (feedChoice.equalsIgnoreCase("yes")){
                                                                elephant.eat();
                                                                elephant.makeSound();
                                                            }
                                                            break;

                                                        case 2:
                                                            Lion lion = new Lion();
                                                            System.out.print("Would you like to feed the Lion? (yes/no): ");
                                                            feedChoice = inputReader.next();

                                                            if (feedChoice.equalsIgnoreCase("yes")) {
                                                                lion.eat();
                                                                lion.makeSound();
                                                            }
                                                            break;

                                                        case 3:
                                                            Owl owl = new Owl();
                                                            System.out.print("Would you like to feed the Owl? (yes/no): ");
                                                            feedChoice = inputReader.next();

                                                            if (feedChoice.equalsIgnoreCase("yes")) {
                                                                owl.eat();
                                                                owl.makeSound();
                                                            }

                                                            break;

                                                        default:
                                                            System.out.println("Invalid input, try again.");
                                                    }
                                                    break;

                                                case 2:
                                                    System.out.println("=== Zoo Shop ===");
                                                    zooInstance.displayProducts();

                                                    System.out.print("Enter the number of the item you want to buy: ");
                                                    int zooItemChoice = inputReader.nextInt();

                                                    visitor.addSelectedItemToVisitorCart(zooInstance.getProductItemByIndex(zooItemChoice));
                                                    visitor.showTotalItemsInCart();

                                                    System.out.print("Proceed to Checkout? (yes/no): ");
                                                    String zooShopCheckoutChoice = inputReader.next();

                                                    if (zooShopCheckoutChoice.equalsIgnoreCase("yes")){
                                                        Vendors vendor = zooInstance.getShopVendor();
                                                        vendor.sell(visitor.getProductsCart());
                                                        visitor.resetCart();
                                                        System.out.println("Thank you " + visitor.getName() + ", we have received your payment!");
                                                    }
                                                    break;

                                                case 3:
                                                    int zooVisitorHospitalChoice = 0;
                                                    while (zooVisitorHospitalChoice != 5) {
                                                        System.out.println("=== Zoo Visitor Hospital Monitor ===");
                                                        System.out.println("1. View Sick Animals");
                                                        System.out.println("2. View Healed Animals");
                                                        System.out.println("3. Attend Science Lecture");
                                                        System.out.println("4. Heal Animals (Veterinarian)");
                                                        System.out.println("5. Exit");
                                                        System.out.print("Choose an option: ");
                                                        zooVisitorHospitalChoice = inputReader.nextInt();

                                                        switch (zooVisitorHospitalChoice) {
                                                            case 1:
                                                                hospitalInstance.viewSickAnimals();
                                                                break;

                                                            case 2:
                                                                hospitalInstance.viewHealAnimals();
                                                                break;

                                                            case 3:
                                                                hospitalInstance.attendScienceLecture(zooInstance);
                                                                break;

                                                            case 4:
                                                                Veterinarians vet = zooInstance.getVet();
                                                                vet.heal(hospitalInstance, zooInstance);
                                                                hospitalInstance.returnHealedAnimalsToEnclosure(
                                                                        pachydermEnclosure,
                                                                        felineEnclosure,
                                                                        birdEnclosure
                                                                );
                                                                break;

                                                            case 5:
                                                                System.out.println("Exiting the Zoo Hospital, Goodbye!...");
                                                                break;

                                                            default:
                                                                System.out.println("Invalid entry, try again.");
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 4:
                                                    System.out.println("Exiting the zoo, Goodbye! ...");
                                                    break;

                                                default:
                                                    System.out.println("Invalid Input, try again.");
                                                    break;
                                            }
                                        }

                                    } else {
                                        System.out.println("Ticket is Invalid, please try again or purchase a ticket.");
                                    }
                                    break;

                                case 3:
                                    System.out.println("Exiting Zoo...");
                                    break;

                                default:
                                    System.out.println("Invalid Entry, please try again.");
                                    break;
                            }
                        }

                    } else {
                        System.out.println("Zoo is not yet open, please try again later.");
                        // add new line
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Exiting Program, Goodbye!");
                    break;

                default:
                    System.out.println("Invalid input try again!");
                    break;
            }
        }

    }
}