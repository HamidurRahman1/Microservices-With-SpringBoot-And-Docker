package com.hamidur.CollegeAPI.rest.services;

import com.hamidur.CollegeAPI.rest.models.Catalog;
import com.hamidur.CollegeAPI.rest.repositories.CatalogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class CatalogService
{
    private final CatalogRepository catalogRepository;
    
    public CatalogService(@Autowired final CatalogRepository catalogRepository) {
        this.catalogRepository = catalogRepository;
    }
    
    public Set<Catalog> getCatalogs() {
        Set<Catalog> catalogs = new HashSet <>();
        catalogRepository.findAll().forEach(catalogs::add);
        return catalogs;
    }
}
