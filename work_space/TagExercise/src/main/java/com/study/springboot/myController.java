package com.study.springboot;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class myController {
	@RequestMapping("/")
	public String root(Model model) {
		ArrayList<Student> arStudent = new ArrayList<Student>();
		
		Student s1 = new Student();
		s1.setName("John");s1.setGender("Male");s1.setMobile("44445555");
		Student s2 = new Student();
		s2.setName("Jane");s2.setGender("Female");s2.setMobile("23234343");
		Student s3 = new Student();
		s3.setName("Jacob");s3.setGender("Male");s3.setMobile("77778888");

		arStudent.add(s1);
		arStudent.add(s2);
		arStudent.add(s3);
		
		model.addAttribute("student",arStudent);
		return "viewStudent";
		
	}
}
/* H
 * 
 *
 * */
