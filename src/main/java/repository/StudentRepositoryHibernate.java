package repository;

import java.util.List;

import model.Student;

public interface StudentRepositoryHibernate {
	List<Student> getAllDetails();

	Student getDetails(int id);
}
