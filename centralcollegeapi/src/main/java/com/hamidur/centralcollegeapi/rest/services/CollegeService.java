package com.hamidur.centralcollegeapi.rest.services;

import com.hamidur.centralcollegeapi.rest.models.College;
import com.hamidur.centralcollegeapi.rest.repositories.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
public class CollegeService {
    private final CollegeRepository collegeRepository;
    
    @Autowired
    public CollegeService(final CollegeRepository collegeRepository) {
        this.collegeRepository = collegeRepository;
    }
    
    public Set<College> getColleges() {
        Set<College> colleges = new HashSet <>();
        collegeRepository.findAll().forEach(colleges::add);
        return colleges;
    }
    
    public College getCollegeById(Integer collegeId) {
        return collegeRepository.findById(collegeId).orElse(null);
    }
    
    public College getCollegeByShortName(String shortName) {
        return collegeRepository.findByNameIdentifierIgnoreCase(shortName).orElse(null);
    }
}
