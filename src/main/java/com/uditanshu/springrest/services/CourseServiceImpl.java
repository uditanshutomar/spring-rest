package com.uditanshu.springrest.services;

import com.uditanshu.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.*;
@Service
public class CourseServiceImpl implements CourseService{
    List<Course> list;
    public CourseServiceImpl(){
        list=new ArrayList<>();
        list.add(new Course(145,"JavaCoreCourse","This course contains basics of java"));
        list.add(new Course(200,"Spring Boot Course","Creating Rest API using Spring Boot"));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }

    @Override
    public Course getCourse(long courseId) {
        Course c=null;
        for(Course course:list){
            if(course.getId()==courseId){
                c=course;
                break;
            }
        }
        return c;
    }
    @Override
    public Course addCourse(Course course){
        list.add(course);
        return course;
    }

}
