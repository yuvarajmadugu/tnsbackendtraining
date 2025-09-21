package com.tns.placementdrive.controller;

import com.tns.placementdrive.entity.Placement;
import com.tns.placementdrive.service.PlacementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PlacementController {

    @Autowired
    public PlacementService ps;

    //add
    @PostMapping("/addpid")
    public Placement addPlacement(@RequestBody Placement placement){
        return ps.addPlacement(placement);
    }

    //get
    @GetMapping("/getemp")
    public List<Placement> getPlacement(){
        return ps.getPlacement();
    }

    //delete
    @DeleteMapping("/deleteeid/{eid}")
    public void deletePlacement(@PathVariable long pid){
        ps.deletePlacement(pid);
    }


}
