package com.example.manageprojet.model;

import java.util.Set;

import org.hibernate.annotations.ManyToAny;

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
@Table(name = "PROJECT")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PROJ_ID")
	private int id;
	
	@Column(name = "PROJ_NAME")
	private String projectName;
	
	@Column(name = "PROD_TECHUSED")
	private String technologyUsed;
	
	@ManyToAny(fetch = FetchType.LAZY)
	@JoinTable(name = "EMPLOYEE_PROJECT_MAPPING", joinColumns = @JoinColumn(name = "PROJECT_ID"), 
					inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
	private Set<Employee> employees;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public String getTechnologyUsed() {
		return technologyUsed;
	}
	
	public void setTechnologyUsed(String technologyUsed) {
		this.technologyUsed = technologyUsed;
	}
	
	public Set<Employee> getEmployees() {
		return employees;
	}
	
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}

	public Project(String projectName, String technologyUsed, Set<Employee> employees) {
		super();
		this.projectName = projectName;
		this.technologyUsed = technologyUsed;
		this.employees = employees;
	}

	public Project() {}

	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", technologyUsed=" + technologyUsed + ", employees=" + employees + "]";
	}
}
