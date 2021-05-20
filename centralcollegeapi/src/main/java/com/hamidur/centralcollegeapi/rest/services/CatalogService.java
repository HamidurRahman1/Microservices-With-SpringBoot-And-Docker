package com.hamidur.centralcollegeapi.rest.services;

import com.hamidur.centralcollegeapi.rest.models.Catalog;
import com.hamidur.centralcollegeapi.rest.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CatalogService {
    private final CatalogRepository catalogRepository;
    
    @Autowired
    public CatalogService(final CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }
    
    public Set<Catalog> getCatalogs() {
        Set<Catalog> catalogs = new HashSet <>();
        catalogRepository.findAll().forEach(catalogs::add);
        return catalogs;
    }
    
    public Catalog getCatalogById(Integer collegeId) {
        return catalogRepository.findById(collegeId).orElse(null);
    }
    
    public Catalog getCollegeByShortName(String catalogName) {
        return catalogRepository.findByCatalogNameIgnoreCase(catalogName).orElse(null);
    }
}
