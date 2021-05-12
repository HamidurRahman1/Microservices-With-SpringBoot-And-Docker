package com.hamidur.centralcollegeapi.rest.controllers;

import com.hamidur.centralcollegeapi.rest.models.College;
import com.hamidur.centralcollegeapi.rest.services.CollegeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/clg")
public class CollegeController {
    private final CollegeService collegeService;
    
    @Autowired
    public CollegeController(final CollegeService collegeService) {
        this.collegeService = collegeService;
    }
    
    @GetMapping(value = "/colleges", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<College>> getColleges () {
        Set<College> colleges = collegeService.getColleges();
        return !colleges.isEmpty()
                ? new ResponseEntity <>(colleges, HttpStatus.OK)
                : new ResponseEntity <>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping(value = "/college/{collegeId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<College> getCollegeById(@PathVariable Integer collegeId) {
        College college = collegeService.getCollegeById(collegeId);
        return college != null
                ? new ResponseEntity <>(college, HttpStatus.OK)
                : new ResponseEntity <>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping(value = "/college/name/{shortName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<College> getCollegeByShortName(@PathVariable String shortName) {
        College college = collegeService.getCollegeByShortName(shortName);
        return college != null
                ? new ResponseEntity <>(college, HttpStatus.OK)
                : new ResponseEntity <>(HttpStatus.NOT_FOUND);
    }
}
