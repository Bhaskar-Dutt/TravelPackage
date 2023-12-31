package com.nymble.travelPackage.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.data.annotation.Id;

@Entity(name="TRAVELPACKAGE")
public class TravelPackage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private StringBuilder name;
    private int passengerCapacity;
    private List<Destination> itinerary;
    private List<Passenger> passengers;

    public TravelPackage(StringBuilder name, int passengerCapacity) {
        this.name = name;
        this.passengerCapacity = passengerCapacity;
        this.itinerary = new ArrayList<>();
        this.passengers = new ArrayList<>();
    }

    public void addDestination(Destination destination) {
        itinerary.add(destination);
    }

    public boolean addPassenger(Passenger passenger) {
        if (passengers.size() < passengerCapacity) {
            passengers.add(passenger);
            return true;
        }
        return false;
    }

    public StringBuilder getName(){
        return name;
    }
    private TravelPackage travelPackage;
    public StringBuilder getTravelPackage(){
        return travelPackage.getName();
    }
    // public getDestinationResponse getDestination(Id id){

    //     HashMap<Destination,List<Activity>> destinationMap = new HashMap<>();
    //     String travelPackageName = [Select name from TravelPackage where id= id];
        

    //     // return destinationMap;
    // }
    // Other getters and setters (omitted for brevity)
}
