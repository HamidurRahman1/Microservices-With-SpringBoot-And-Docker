package com.hamidur.CollegeAPI.rest.models;

import java.util.Objects;

public class Course
{
    private Integer courseId;
    private String courseCatalog;
    private String description;
    
    public Course()
    {
    
    }
    
    public Course(Integer courseId, String courseCatalog, String description)
    {
        this.courseId = courseId;
        this.courseCatalog = courseCatalog;
        this.description = description;
    }
    
    public Integer getCourseId()
    {
        return courseId;
    }
    
    public void setCourseId(Integer courseId)
    {
        this.courseId = courseId;
    }
    
    public String getCourseCatalog()
    {
        return courseCatalog;
    }
    
    public void setCourseCatalog(String courseCatalog)
    {
        this.courseCatalog = courseCatalog;
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
        Course course = (Course) o;
        return Objects.equals(courseId, course.courseId)
                && Objects.equals(courseCatalog, course.courseCatalog)
                && Objects.equals(description, course.description);
    }
    
    @Override
    public int hashCode()
    {
        return Objects.hash(courseId, courseCatalog, description);
    }
    
    @Override
    public String toString()
    {
        return "Course{" + "courseId=" + courseId + ", courseCatalog='" + courseCatalog + '\'' + ", description='" + description + '\'' + '}';
    }
}
