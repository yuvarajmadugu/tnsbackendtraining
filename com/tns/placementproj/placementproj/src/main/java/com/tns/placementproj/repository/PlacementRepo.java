package com.tns.placementproj.repository;

import com.tns.placementproj.entity.Placement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlacementRepo extends JpaRepository<Placement, Long> {
}
