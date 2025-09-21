package com.tns.placementdrive.repository;

import com.tns.placementdrive.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlacementRepo extends JpaRepository<Placement, Long> {
    // No need to add code — JpaRepository gives us all CRUD methods
}
