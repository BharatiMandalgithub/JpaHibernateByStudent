package com.example.demo.studentcontroller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studEntity.Student;

@RestController

@RequestMapping("/stud")
public class StudController {
	
	private Map<Long, Student> studentEntry = new HashMap<>();
	
	//Getting all the data/list of students
	@GetMapping
	public List<Student> getAll(){
		return new ArrayList<>(studentEntry.values());
	}
	
	
	//Data created by using post method or post mapping
	@PostMapping
	public boolean createEntry(@RequestBody Student myEntry) {
		studentEntry.put(myEntry.getId(), myEntry);
		return true;
	}
	
	//get individual students data by their id
	@GetMapping("/id/{myId}")
	public Student getStudentsDataById(@PathVariable Long myId) {
		return studentEntry.get(myId);
	}
	
	//delete students individual by their id
	@DeleteMapping("/id/{myId}")
	public Student deleteStudentById(@PathVariable Long myId) {
		return studentEntry.remove(myId);
	}
	
	//update students by their id
	@PutMapping("/id/{id}")
	public Student updateStudentById(@PathVariable Long id, @RequestBody Student myEntry) {
	    return studentEntry.put(id, myEntry);
	}
	
	
	
	
}
