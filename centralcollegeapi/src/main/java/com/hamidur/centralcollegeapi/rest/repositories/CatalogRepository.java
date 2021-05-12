package com.hamidur.centralcollegeapi.rest.repositories;

import com.hamidur.centralcollegeapi.rest.models.Catalog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatalogRepository extends CrudRepository<Catalog, Integer> {
}
