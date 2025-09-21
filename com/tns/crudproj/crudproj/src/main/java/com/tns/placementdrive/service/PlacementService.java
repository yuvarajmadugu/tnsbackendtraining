package com.tns.placementdrive.service;

import com.tns.placementdrive.entity.Placement;
import com.tns.placementdrive.repository.PlacementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {

    @Autowired
    public PlacementRepo pr;

    //insert or create
    public Placement addPlacement(Placement placement){
        return pr.save(placement);
    }

    //get or retrieve
    public List<Placement> getPlacement(){
        return pr.findAll();
    }

    //delete
    public void deletePlacement(long pid){
        pr.deleteById(pid);
    }

    //update
    public Placement updatePlacement(Placement placement){
        Long pid = placement.getPid();
        Placement placement1 = pr.findById(pid).get();
        placement1.setName(placement.getName());
        placement1.setCollege(placement.getCollege());
        placement1.setDate(placement.getDate());
        placement1.setQualification(placement.getQualification());
        placement1.setYear(placement.getYear());
        return pr.save(placement1);
    }
}
