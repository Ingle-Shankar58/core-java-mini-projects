package View;

import java.util.*;

import Controller.EmployeeContrilar;
import Model.Admin;
import Model.Employee;
import Model.HR;
import Model.SalseManager;

public class EmployeeView {

	Scanner sc = new Scanner(System.in);
	EmployeeContrilar ec;

	public EmployeeView(EmployeeContrilar ec) {

		this.ec = ec;
	}

	public void ShowOption() {

		int choice = 0;

		do {
			System.out.println("1. Add Employee ");
			System.out.println("2. Search Employee");
			System.out.println("3. Update Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. View All Employee");
			System.out.print("Enter Choice ==> : ");

			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.println("Enter Employee Type :\n1-HR\n2-Admin\n3-SalseManager");
				System.out.println("==> : ");
				int type = sc.nextInt();

				System.out.println("Enter EmpID :");
				int id = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter EmpName: ");
				String name = sc.nextLine();
				System.out.println("Enter Salary :");
				double salary = sc.nextDouble();

				if (type == 1) {
					System.out.println("Enter Comission:");
					double comission = sc.nextDouble();
					if (ec.addEmployee(new HR(id, name, salary, comission))) {
						System.out.println("HR Add SucessFully !!!");
					} else {
						System.out.println("Array Is Full !!!");
					}

				} else if (type == 2) {
					System.out.println("Enter Allowance :");
					double Allowance = sc.nextDouble();
					if (ec.addEmployee(new Admin(id, name, salary, Allowance))) {
						System.out.println("Admin Add Sucess Fully !!!");
					} else {
						System.out.println("Array Is Full !!!");
					}

				} else if (type == 3) {
					System.out.println("Enter Comission: ");
					double commission = sc.nextDouble();
					if (ec.addEmployee(new SalseManager(id, name, salary, commission))) {
						System.out.println("Salse Manager Add SucessFully !!!");
					} else {
						System.out.println("Array IS Full !!!");
					}

				}
				break;
			case 2:
				System.out.print("Enter ID to search: ");
				id = sc.nextInt();
				Employee e = ec.searchEmployeeById(id);
				if (e != null)
					System.out.println("Found: " + e);
				else
					System.out.println("Employee not found.");
				break;
			case 3:
				System.out.print("Enter ID to update: ");
				id = sc.nextInt();
				System.out.print("Enter New Salary: ");
				salary = sc.nextDouble();
				if (ec.updateEmployee(id, salary))
					System.out.println("Updated successfully!");
				else
					System.out.println("Employee not found.");
				break;
			case 4:
				System.out.print("Enter ID to delete: ");
				id = sc.nextInt();
				if (ec.deleteEmployee(id))
					System.out.println("Deleted successfully!");
				else
					System.out.println("Employee not found.");
				break;
			case 5:
				ec.displayAll();
				break;
			}

		} while (choice != 0);
		System.out.println("Program Exit !!!");
	}
}
