package com.example.jfs_jwt.controller;

import com.example.jfs_jwt.model.Course;
import com.example.jfs_jwt.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @CrossOrigin("*")
    @GetMapping("/api/courses")
    List<Course> all() {
        return courseService.all();
    }

    @PostMapping("/api/courses")
    void save(Course course) {
        courseService.save(course);
    }

    @DeleteMapping("/api/courses/{courseId}")
    void delete(@PathVariable String courseId) {
        courseService.delete(courseId);
    }
}
