package repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Student;

public class StudentRepositoryHibernateImpl implements StudentRepositoryHibernate {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Student> getAllDetails() {
		return getSessionFactory().getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public Student getDetails(int id) {
		return (Student) getSessionFactory()
				.getCurrentSession()
				.createQuery("from Student S where S.sid = :id").setParameter("id", id).list().get(0);
	}

	private SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
