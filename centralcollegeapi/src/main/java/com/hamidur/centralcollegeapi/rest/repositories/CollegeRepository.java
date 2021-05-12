package com.hamidur.centralcollegeapi.rest.repositories;

import com.hamidur.centralcollegeapi.rest.models.College;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer> {
    Optional<College> findByNameIdentifierIgnoreCase(String nameIdentifier);
}
