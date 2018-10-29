package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	@Id
	@Column(name="sid")
	@GeneratedValue
	private int sid;
	
	@Column(name="firstName")
	private String firstName;
	
	@Column(name="secondName")
	private String secondName;
	
	public Student () {
		
	}
	public Student(int sid, String firstName, String secondName) {
		super();
		this.sid = sid;
		this.firstName = firstName;
		this.secondName = secondName;
	}
	
	public int getSid() {
		return sid;
	}
	
	public void setSid(int sid) {
		this.sid = sid;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getSecondName() {
		return secondName;
	}
	
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", firstName=" + firstName + ", secondName=" + secondName + "]";
	}
	
}
