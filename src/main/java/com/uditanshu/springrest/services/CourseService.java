package com.uditanshu.springrest.services;

import com.uditanshu.springrest.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();
    public  Course getCourse(long courseId);
    public Course addCourse(Course course);
}

