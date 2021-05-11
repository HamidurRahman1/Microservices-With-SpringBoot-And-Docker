package com.hamidur.CollegeAPI.rest.models;

import java.time.LocalDate;
import java.util.Objects;

public class College
{
    private Integer collegeId;
    private String nameIdentifier;
    private String name;
    private LocalDate joinDate;
    
    public College()
    {
    
    }
    
    public College(Integer collegeId, String nameIdentifier, String name, LocalDate joinDate)
    {
        this.collegeId = collegeId;
        this.nameIdentifier = nameIdentifier;
        this.name = name;
        this.joinDate = joinDate;
    }
    
    public Integer getCollegeId()
    {
        return collegeId;
    }
    
    public void setCollegeId(Integer collegeId)
    {
        this.collegeId = collegeId;
    }
    
    public String getNameIdentifier()
    {
        return nameIdentifier;
    }
    
    public void setNameIdentifier(String nameIdentifier)
    {
        this.nameIdentifier = nameIdentifier;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public LocalDate getJoinDate()
    {
        return joinDate;
    }
    
    public void setJoinDate(LocalDate joinDate)
    {
        this.joinDate = joinDate;
    }
    
    @Override
    public boolean equals(Object o)
    {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        College college = (College) o;
        return Objects.equals(collegeId, college.collegeId)
                && Objects.equals(nameIdentifier, college.nameIdentifier)
                && Objects.equals(name, college.name)
                && Objects.equals(joinDate, college.joinDate);
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(collegeId, nameIdentifier, name, joinDate);
    }
    
    @Override
    public String toString()
    {
        return "College{" + "collegeId=" + collegeId + ", nameIdentifier='" + nameIdentifier + '\'' + ", name='" + name + '\'' + ", joinDate=" + joinDate + '}';
    }
}
