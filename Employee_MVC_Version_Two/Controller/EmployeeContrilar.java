package Controller;

import Model.Employee;

public class EmployeeContrilar {
	EmployeeDAO ed = new EmployeeDAO();

	public boolean addEmployee(Employee e) {
		if (ed.addEmployee(e)) {
			return true;
		} else {
			return false;
		}

	}

	public Employee searchEmployeeById(int id) {

		Employee e1 = ed.SearchEnployee(id);
		if (e1 != null) {
			return e1;
		}
		return null;
	}

	public boolean updateEmployee(int id, double salary) {
		if (ed.updateEmployee(id, salary)) {
			return true;
		}
		return false;
	}

	public boolean deleteEmployee(int id) {
		if (ed.deleteEmployee(id)) {
			return true;
		}
		return false;

	}

	public void displayAll() {
		ed.displayEmployee();

	}

}
