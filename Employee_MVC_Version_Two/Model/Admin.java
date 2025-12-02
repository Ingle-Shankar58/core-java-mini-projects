package Model;

public class Admin extends Employee {

	double Allowance;

	// Default constructor

	Admin() {

		super();
		this.Allowance = 1000;
	}

	// Parameterized Constructor

	public Admin(int id, String name, double salary, double allowance) {

		super(id, name, salary);
		this.Allowance = allowance;
	}

	// Getters and Setters

	double getAllowance() {
		return Allowance;
	}

	void setAllowance(double allowance) {
		Allowance = allowance;
	}

	// Display

	// Calculate Salary

	double calSalary() {

		return salary + Allowance;
	}

	@Override
	public String toString() {
		return super.toString() + "\nAllowance=" + Allowance + "5"+ "\n---------------------------------------"; 
		
	}

} // Admin class ends here
