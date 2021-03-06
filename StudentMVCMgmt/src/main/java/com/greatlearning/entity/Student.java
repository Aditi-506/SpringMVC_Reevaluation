package com.greatlearning.entity;

import javax.management.loading.PrivateClassLoader;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue
	private int id;

	private String name;
	private String department;
	private String country;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String department, String country) {
		super();
		this.name = name;
		this.department = department;
		this.country = country;
	}

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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", department=" + department + ", country=" + country + "]";
	}

}
