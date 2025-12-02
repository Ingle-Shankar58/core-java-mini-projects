package Model;

public abstract class Employee {
	int id;
	String name;
	double salary;

	// Default constructor

	Employee() {

		this.id = 1;
		this.name = "Not declare";
		this.salary = 0;
	}

	// Parameterized Constructor

	Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	// Getters and Setters

	public int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	// Calculate Salary

	abstract double calSalary();

	@Override
	public String toString() {
		System.out.println("\n====> Employee Details <====\n");
		return "id=" + id + ",\nname=" + name + ",\nsalary=" + salary + "";
	}

} // Employee Class ends here
