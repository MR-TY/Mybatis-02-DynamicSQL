package com.ty.entity;

public class Employee {
	private Integer id; 
	private String last_name;
	private String gender; 
	private String email;
	private Department dept;
	
	public Department getDepartment() {
		return dept;
	}
	public void setDepartment(Department department) {
		this.dept = department;
	}
	public Employee(Integer id) {
		super();
		this.id = id;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	} 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getlast_name() {
		return last_name;
	}
	public void setlast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", last_name=" + last_name + ", gender=" + gender + ", email=" + email
				+ ", department=" + dept + "]";
	}
	
}
