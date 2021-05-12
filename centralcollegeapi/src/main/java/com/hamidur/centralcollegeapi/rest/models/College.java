package com.hamidur.centralcollegeapi.rest.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "colleges", schema = "central")
public class College {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "college_id")
    private Integer collegeId;
    
    @Column(name = "short_name", unique = true, nullable = false, length = 5)
    private String nameIdentifier;
    
    @Column(name = "full_name", unique = true, nullable = false, length = 50)
    private String name;
    
    @Column(name = "join_date", nullable = false)
    private LocalDate joinDate;
    
    public College() {
    }
    
    public College(Integer collegeId, String nameIdentifier, String name, LocalDate joinDate) {
        this.collegeId = collegeId;
        this.nameIdentifier = nameIdentifier;
        this.name = name;
        this.joinDate = joinDate;
    }
    
    public Integer getCollegeId() {
        return collegeId;
    }
    
    public void setCollegeId(Integer collegeId) {
        this.collegeId = collegeId;
    }
    
    public String getNameIdentifier() {
        return nameIdentifier;
    }
    
    public void setNameIdentifier(String nameIdentifier) {
        this.nameIdentifier = nameIdentifier;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public LocalDate getJoinDate() {
        return joinDate;
    }
    
    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }
    
    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        College college = (College) o;
        return Objects.equals(collegeId, college.collegeId)
                && Objects.equals(nameIdentifier, college.nameIdentifier)
                && Objects.equals(name, college.name)
                && Objects.equals(joinDate, college.joinDate);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(collegeId, nameIdentifier, name, joinDate);
    }
    
    @Override
    public String toString() {
        return "College{" + "collegeId=" + collegeId + ", nameIdentifier='" + nameIdentifier + '\'' + ", name='" + name + '\'' + ", joinDate=" + joinDate + '}';
    }
}
