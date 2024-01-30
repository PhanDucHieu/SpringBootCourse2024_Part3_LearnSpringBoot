package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    // Course : id, name, author

    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "in28minutes"),
                new Course(2, "Learn DevOps", "in28minutes"),
                new Course(3, "Learn AWS 2", "in28minutes"),
                new Course(4, "Learn DevOps 2", "in28minutes"),
                new Course(5, "Learn DevOps 2", "in28minutes")
        );
    }

}
