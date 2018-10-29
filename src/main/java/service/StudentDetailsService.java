package service;

import java.util.List;

import model.Student;

public interface StudentDetailsService {
	List<Student> getAllDetails();
	Student getDetails(int id);
}