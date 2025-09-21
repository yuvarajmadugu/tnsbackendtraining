package com.tns.crudproj.repository;

import com.tns.crudproj.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepo extends JpaRepository<Emp, Integer> {
    // No need to add code — JpaRepository gives us all CRUD methods
}
