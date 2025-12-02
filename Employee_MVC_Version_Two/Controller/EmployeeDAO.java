package Controller;

import java.util.ArrayList;

import Model.Admin;
import Model.Employee;
import Model.HR;
import Model.SalseManager;

// DAO DATA ACCESS OBJECT 

public class EmployeeDAO {

	static ArrayList<Employee> eArr = new ArrayList<Employee>();

	static {
		eArr.add(new HR(101, "Ranjit", 50000, 5000));
		eArr.add(new HR(102, "Amit", 48000, 4500));
		eArr.add(new HR(103, "Sneha", 47000, 4000));
		eArr.add(new SalseManager(201, "Karan", 60000, 8000));
		eArr.add(new SalseManager(202, "Meena", 58000, 7500));
		eArr.add(new SalseManager(203, "Rohit", 62000, 9000));
		eArr.add(new Admin(301, "Pragati", 70000, 10000));
		eArr.add(new Admin(302, "Isha", 68000, 9500));
		eArr.add(new Admin(303, "Pooja", 72000, 11000));
		eArr.add(new Admin(304, "Shubham", 75000, 12000));

	}

	public boolean addEmployee(Employee e) {
		
		return eArr.add(e);

	}

	public Employee SearchEnployee(int id) {
		
		for(Employee e : eArr) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		for(Employee e : eArr) {
			if(e.getId()==id) {
				e.setSalary(salary);
				return true;
			}
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		
		for(Employee e : eArr) {
			
			if(e.getId() == id) {
				eArr.remove(e);
				return true;
			}
		}
		return false;
	}

	public void displayEmployee() {
		
		
		for(Employee e : eArr) {
			System.out.println(e);
		}
	}

}
