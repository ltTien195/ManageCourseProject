package com.example.coursemanagement.service;

import com.example.coursemanagement.entity.Course;
import java.util.List;

public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(Long id);
    Course saveCourse(Course course);
    void deleteCourse(Long id);
}
