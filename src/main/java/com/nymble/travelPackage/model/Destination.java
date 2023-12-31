package com.nymble.travelPackage.model;

import java.util.ArrayList;
import java.util.List;

public class Destination {
    private StringBuilder name;
    private List<Activity> activities;

    public Destination(StringBuilder name) {
        this.name = name;
        this.activities = new ArrayList<>();
    }

    public void addActivity(Activity activity) {
        activities.add(activity);
    }

    public List<Activity> getActivities() {
        return activities;
    }
}