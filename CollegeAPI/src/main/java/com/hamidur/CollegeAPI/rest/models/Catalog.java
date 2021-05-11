package com.hamidur.CollegeAPI.rest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "catalogs", schema = "central")
public class Catalog
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catalog_id")
    private Integer catalogId;
    
    @Column(name = "catalog_name", length = 5, nullable = false, unique = true)
    private String catalogName;
    
    @Column(name = "description", length = 500, nullable = false)
    private String description;
    
    public Catalog()
    {
    
    }
    
    public Catalog(Integer courseId, String catalogName, String description)
    {
        this.catalogId = courseId;
        this.catalogName = catalogName;
        this.description = description;
    }
    
    public Integer getCatalogId()
    {
        return catalogId;
    }
    
    public void setCatalogId(Integer catalogId)
    {
        this.catalogId = catalogId;
    }
    
    public String getCatalogName()
    {
        return catalogName;
    }
    
    public void setCatalogName(String catalogName)
    {
        this.catalogName = catalogName;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public void setDescription(String description)
    {
        this.description = description;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Catalog course = (Catalog) o;
        return Objects.equals(catalogId, course.catalogId)
                && Objects.equals(catalogName, course.catalogName)
                && Objects.equals(description, course.description);
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(catalogId, catalogName, description);
    }
    
    @Override
    public String toString()
    {
        return "Course{" + "courseId=" + catalogId + ", catalogName='" + catalogName + '\'' + ", description='" + description + '\'' + '}';
    }
}
