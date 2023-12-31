package com.nymble.travelPackage;

import java.util.ArrayList;
import java.util.List;

import com.nymble.travelPackage.model.Activity;
import com.nymble.travelPackage.model.Destination;
import com.nymble.travelPackage.model.Passenger;
import com.nymble.travelPackage.model.TravelPackage;

public class TravelAgencySystem {
    public static void main(String[] args) {
        Activity hiking = new Activity("Hiking", "Explore the trails", 50, 20);
        Activity snorkeling = new Activity("Snorkeling", "Discover underwater life", 80, 15);

        Destination mountainTown = new Destination("Mountain Town");
        mountainTown.addActivity(hiking);

        Destination beachResort = new Destination("Beach Resort");
        beachResort.addActivity(snorkeling);

        TravelPackage adventureTrip = new TravelPackage("Adventure Trip", 30);
        adventureTrip.addDestination(mountainTown);
        adventureTrip.addDestination(beachResort);

        Passenger standardPassenger = new Passenger("Alice", 1, PassengerType.STANDARD, 100);
        Passenger goldPassenger = new Passenger("Bob", 2, PassengerType.GOLD, 200);
        Passenger premiumPassenger = new Passenger("Charlie", 3, PassengerType.PREMIUM, 0);

        standardPassengerSignUpForActivity(standardPassenger, hiking);
        goldPassengerSignUpForActivity(goldPassenger, snorkeling);
        premiumPassengerSignUpForActivity(premiumPassenger, hiking);

        // Display passenger information
        displayPassengerInfo(standardPassenger);
        displayPassengerInfo(goldPassenger);
        displayPassengerInfo(premiumPassenger);
    }

    public static void standardPassengerSignUpForActivity(Passenger passenger, Activity activity) {
        if (passenger.getType() == PassengerType.STANDARD) {
            if (passenger.getBalance() >= activity.getCost()) {
                passenger.setBalance(passenger.getBalance() - activity.getCost());
                System.out.println(passenger.getName() + " signed up for " + activity.getName());
            } else {
                System.out.println("Insufficient balance for " + passenger.getName() + " to sign up for " + activity.getName());
            }
        }
    }

    public static void goldPassengerSignUpForActivity(Passenger passenger, Activity activity) {
        if (passenger.getType() == PassengerType.GOLD) {
            double discountedCost = activity.getCost() * 0.9;
            if (passenger.getBalance() >= discountedCost) {
                passenger.setBalance(passenger.getBalance() - discountedCost);
                System.out.println(passenger.getName() + " (Gold) signed up for " + activity.getName() + " with a 10% discount");
            } else {
                System.out.println("Insufficient balance for " + passenger.getName() + " (Gold) to sign up for " + activity.getName());
            }
        }
    }

    public static void premiumPassengerSignUpForActivity(Passenger passenger, Activity activity) {
        if (passenger.getType() == PassengerType.PREMIUM) {
            System.out.println(passenger.getName() + " (Premium) signed up for " + activity.getName() + " for free");
        }
    }

    public static void displayPassengerInfo(Passenger passenger) {
        System.out.println("Passenger: " + passenger.getName() + " (Type: " + passenger.getType() + ", Balance: $" + passenger.getBalance() + ")");
    }
}

