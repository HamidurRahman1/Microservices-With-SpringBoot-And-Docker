package com.hamidur.CollegeAPI.rest.repositories;

import com.hamidur.CollegeAPI.rest.models.College;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface CollegeRepository extends CrudRepository<College, Integer>
{
    College findByNameIdentifierIgnoreCase(String nameIdentifier);
}
