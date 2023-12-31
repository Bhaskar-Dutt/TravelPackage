package com.nymble.travelPackage.service;

import java.util.HashMap;
import java.util.List;

import com.nymble.travelPackage.model.Activity;
import com.nymble.travelPackage.model.Destination;
import com.nymble.travelPackage.model.TravelPackage;

public class ActivityService {
    StringBuilder str = new StringBuilder("popeye");
    StringBuilder str1 = new StringBuilder("Explore the trails");
    Activity hiking = new Activity(str, str1, 50, 20);
    StringBuilder strr = new StringBuilder("Snorkeling");
    StringBuilder strr1 = new StringBuilder("Discover underwater life");
    Activity snorkeling = new Activity(strr, strr1, 80, 15);

    
    
}
