package com.resttest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.resttest.model.Name;
import com.resttest.model.Student;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping(value= "/getstudent/{id}")
	public @ResponseBody Student getSudent(@PathVariable(value = "id") String id ) {
		return new Student(new Name("Mr", "Khandekar", "Md", "Saleh"), "Str001", "xx1");
	}
}
