package com.tns.placementproj.service;

import com.tns.placementproj.entity.Placement;
import com.tns.placementproj.repository.PlacementRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlacementService {

    @Autowired
    private PlacementRepo placementRepo;

    // insert or create
    public Placement addPlacement(Placement placement) {
        return placementRepo.save(placement);
    }

    // get or retrieve
    public List<Placement> getPlacement() {
        return placementRepo.findAll();
    }

    // delete
    public void deletePlacement(long pid) {
        placementRepo.deleteById(pid);
    }

    // update
    public Placement updatePlacement(Placement placement) {
        Placement existing = placementRepo.findById(placement.getPid()).orElseThrow(
                () -> new RuntimeException("Placement not found with id " + placement.getPid())
        );

        existing.setName(placement.getName());
        existing.setCollege(placement.getCollege());
        existing.setPlacementDate(placement.getPlacementDate());
        existing.setQualification(placement.getQualification());
        existing.setYear(placement.getYear());

        return placementRepo.save(existing);
    }
}
