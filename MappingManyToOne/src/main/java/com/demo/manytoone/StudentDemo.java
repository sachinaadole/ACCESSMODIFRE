package com.demo.manytoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;
@Entity
@Table(name="StudentDemo_table")
public class StudentDemo 
{
	@Id
	@Column
	@GeneratedValue
	private int stud_id;
	@Column
	private String stud_name;
	@Column
	private String section;
	//@ManyToOne //unidirectinal
	//@JoinColumn(name="University_id")//uni
	
	@ManyToOne(optional= false)
	@JoinColumn(name="University_id")
	private University university;
	
	public int getStud_id() {
		return stud_id;
	}
	public void setStud_id(int stud_id) {
		this.stud_id = stud_id;
	}
	
	
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public String getSection() {
		return section;
	}
	
	public void setSection(String section) {
		this.section = section;
	}
	
	public University getUniversity() {
		return university;
	}
	
	public void setUniversity(University university) {
		this.university = university;
	}
	
	public StudentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentDemo(String stud_name, String section) {
		super();
		this.stud_name = stud_name;
		this.section = section;
	}
	@Override
	public String toString() {
		return "StudentDemo [stud_id=" + stud_id + ", stud_name=" + stud_name
				+ ", section=" + section + ", university=" + university + "]";
	}
	
	
	
}
