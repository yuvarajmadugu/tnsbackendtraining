package com.tns.placementproj.controller;

import com.tns.placementproj.entity.Placement;
import com.tns.placementproj.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/placement") // common prefix
public class PlacementController {

    @Autowired
    private PlacementService placementService;

    // Add new placement
    @PostMapping("/add")
    public Placement addPlacement(@RequestBody Placement placement) {
        return placementService.addPlacement(placement);
    }

    // Get all placements
    @GetMapping("/all")
    public List<Placement> getPlacement() {
        return placementService.getPlacement();
    }

    // Delete placement by ID
    @DeleteMapping("/delete/{pid}")
    public String deletePlacement(@PathVariable long pid) {
        placementService.deletePlacement(pid);
        return "Placement with ID " + pid + " deleted successfully.";
    }

    // Update placement
    @PutMapping("/update")
    public Placement updatePlacement(@RequestBody Placement placement) {
        return placementService.updatePlacement(placement);
    }

    @GetMapping("/test")
    public String test() {
        return "Controller is working!";
    }

}
