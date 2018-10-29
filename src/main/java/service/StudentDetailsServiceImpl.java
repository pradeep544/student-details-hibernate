package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import model.Student;
import repository.StudentRepositoryHibernate;

@Service
public class StudentDetailsServiceImpl implements StudentDetailsService {
	
	@Autowired
	private StudentRepositoryHibernate studentRepositoryHibernateImpl;
	
	public StudentDetailsServiceImpl(){
		
	}	
	
	public StudentRepositoryHibernate getStudentRepositoryHibernateImpl() {
		return studentRepositoryHibernateImpl;
	}


	public void setStudentRepositoryHibernateImpl(StudentRepositoryHibernate studentRepositoryHibernateImpl) {
		this.studentRepositoryHibernateImpl = studentRepositoryHibernateImpl;
	}

	@Override
	@Transactional
	public List<Student> getAllDetails(){
		return studentRepositoryHibernateImpl.getAllDetails();
	}
	

	@Override
	@Transactional
	public Student getDetails(int id) {
		return studentRepositoryHibernateImpl.getDetails(id);
	}


}
