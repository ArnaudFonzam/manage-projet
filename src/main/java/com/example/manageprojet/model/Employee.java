package com.example.manageprojet.model;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "EMP_ID")
	private int id;
	
	@Column(name = "EMP_NAME")
	private String name;
	
	@Column(name = "EMP_EMAIL")
	private String email;
	
	@Column(name = "EMP_TECHSKILL")
	private String technicalSkill;
	
	@ManyToAny(fetch = FetchType.LAZY)
	@JoinTable(name = "EMPLOYEE_PROJECT_MAPPING", joinColumns = @JoinColumn(name = "EMPLOYEE_ID"), 
					inverseJoinColumns = @JoinColumn(name = "PROJECT_ID"))
	private Set<Project> projects;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTechnicalSkill() {
		return technicalSkill;
	}
	
	public void setTechnicalSkill(String technicalSkill) {
		this.technicalSkill = technicalSkill;
	}
	
	public Set<Project> getProjects() {
		return projects;
	}
	
	public void setProjects(Set<Project> projects) {
		this.projects = projects;
	}

	public Employee() {}

	public Employee(String name, String email, String technicalSkill, Set<Project> projects) {
		super();
		this.name = name;
		this.email = email;
		this.technicalSkill = technicalSkill;
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", technicalSkill=" + technicalSkill + ", projects=" + projects + "]";
	}
	
	
}
