package com.uditanshu.springrest.controller;

import com.uditanshu.springrest.entities.Course;
import com.uditanshu.springrest.services.CourseService;
import org.apache.catalina.LifecycleState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.List;

@RestController
public class MyController {
//get the courses
    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses()
    {
      return this.courseService.getCourses();
    }
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable long courseId){
        return this.courseService.getCourse(courseId);
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }
}
