package com.hamidur.centralcollegeapi.rest.controllers;

import com.hamidur.centralcollegeapi.rest.models.Catalog;
import com.hamidur.centralcollegeapi.rest.services.CatalogService;

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
@RequestMapping("/ctlg")
public class CatalogController
{
    private final CatalogService catalogService;
    
    @Autowired
    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }
    
    @GetMapping(value = "/catalogs", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Set<Catalog>> getCatalogs () {
        Set<Catalog> catalogs = catalogService.getCatalogs();
        return !catalogs.isEmpty()
                ? new ResponseEntity <>(catalogs, HttpStatus.OK)
                : new ResponseEntity <>(HttpStatus.NO_CONTENT);
    }
    
    @GetMapping(value = "/catalog/{catalogId}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Catalog> getCatalogById(@PathVariable Integer catalogId) {
        Catalog catalog = catalogService.getCatalogById(catalogId);
        return catalog != null
                ? new ResponseEntity <>(catalog, HttpStatus.OK)
                : new ResponseEntity <>(HttpStatus.NOT_FOUND);
    }
    
    @GetMapping(value = "/catalog/name/{catalogName}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Catalog> getCatalogByCatalogName(@PathVariable String catalogName) {
        Catalog catalog = catalogService.getCatalogByCatalogName(catalogName);
        return catalog != null
                ? new ResponseEntity <>(catalog, HttpStatus.OK)
                : new ResponseEntity <>(HttpStatus.NOT_FOUND);
    }
}
