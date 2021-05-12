package com.hamidur.centralcollegeapi.rest.controllers;

import com.hamidur.centralcollegeapi.rest.models.College;
import com.hamidur.centralcollegeapi.rest.services.CollegeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class CollegeController {
    private final CollegeService collegeService;
    
    @Autowired
    public CollegeController(final CollegeService collegeService) {
        this.collegeService = collegeService;
    }
    
    
    @GetMapping(value = "/")
    public String home()
    {
        return "home";
    }
    
    @GetMapping(value = "/colleges", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<College>> getColleges () {
        Set<College> colleges = collegeService.getColleges();
        System.out.println(colleges);
        return !colleges.isEmpty()
                ? new ResponseEntity <>(colleges, HttpStatus.OK)
                : new ResponseEntity <>(HttpStatus.NO_CONTENT);
    }
}
