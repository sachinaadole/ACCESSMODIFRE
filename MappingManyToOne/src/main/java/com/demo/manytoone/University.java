package com.demo.manytoone;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="University_table")
public class University 
{
	@Id
	@Column
	@GeneratedValue
	private int university_id;
	@Column
	private String university_name;
	@Column
	private String country;
	
	//@OneToMany(mappedBy="university",cascade=CascadeType.ALL)//bidir
	//private List<StudentDemo> student;//bidir
	
	
	/*
	public List<StudentDemo> getStudent() {
		return student;
	}

	
	public void setStudent(List<StudentDemo> student) {
		this.student = student;
	}
*/
	public int getUniversity_id() {
		return university_id;
	}
	
	public void setUniversity_id(int university_id) {
		this.university_id = university_id;
	}
	
	public String getUniversity_name() {
		return university_name;
	}
	
	public void setUniversity_name(String university_name) {
		this.university_name = university_name;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}

	public University() {
		super();
		
	}
	

	/**
	 * @return the student
	 */
	
	/**
	 * @param student the student to set
	 */
	
	public University(String university_name, String country) {
		super();
		this.university_name = university_name;
		this.country = country;
	}

	@Override
	public String toString() {
		return "University [university_id=" + university_id
				+ ", university_name=" + university_name + ", country="
				+ country + "]";
	}
	
	

}
