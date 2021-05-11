package com.hamidur.CollegeAPI.rest.services;

import com.hamidur.CollegeAPI.rest.models.College;
import com.hamidur.CollegeAPI.rest.repositories.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CollegeService
{
    private final CollegeRepository collegeRepository;
    
    public CollegeService(@Autowired final CollegeRepository collegeRepository)
    {
        this.collegeRepository = collegeRepository;
    }
    
    public Set<College> getColleges()
    {
        Set<College> colleges = new HashSet <>();
        collegeRepository.findAll().forEach(colleges::add);
        return colleges;
    }
}
