package com.icm.util;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CaseCreationServiceApplication {

	//@Autowired
	//private StudentService studentService;

	@GetMapping("/students/{studentId}/courses")
	public String retrieveCoursesForStudent(@PathVariable String studentId) {
		return  "vaidehi";//studentService.retrieveCourses(studentId);
	}
	
	@GetMapping("/students/{studentId}/courses/{courseId}")
	public String retrieveDetailsForCourse(@PathVariable String studentId,
			@PathVariable String courseId) {
		return studentId; //studentService.retrieveCourse(studentId, courseId);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(CaseCreationServiceApplication.class, args);
	}

}
