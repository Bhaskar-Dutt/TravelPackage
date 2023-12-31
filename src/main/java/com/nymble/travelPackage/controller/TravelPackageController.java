package com.nymble.travelPackage.controller;

import com.nymble.travelPackage.model.TravelPackage;
import com.nymble.travelPackage.model.getDestinationResponse;
import com.nymble.travelPackage.service.TravelPackageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.annotation.Id;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/travelpackages")
public class TravelPackageController {
    private final TravelPackageService travelPackageService;

    @Autowired
    public TravelPackageController(TravelPackageService travelPackageService) {
        this.travelPackageService = travelPackageService;
    }

    @GetMapping("{packageId}")
    public ResponseEntity<getDestinationResponse> getItinerary(@PathVariable("packageId") Id packageId) {
        //call function to print data;
        // return new SomeData();
        // return ResponseEntity.ok();  check this
        getDestinationResponse GDR = travelPackageService.getDestination(packageId);
//        return GDR;
        //new model class

    }
}
