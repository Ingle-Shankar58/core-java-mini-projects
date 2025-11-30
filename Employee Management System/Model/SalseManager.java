package Model;

public class SalseManager extends Employee {

	double incentive;

	// Default constructor

	SalseManager() {

		super();
		this.incentive = 1000;
	}

	// Parameterized Constructor

	public SalseManager(int id, String name, double salary, double incentive) {

		super(id, name, salary);
		this.incentive = incentive;
	}

	// Getters and Setters

	double getincentive() {
		return incentive;
	}

	void setCommission(double incentive) {
		this.incentive = incentive;
	}

	// Display

	@Override
	public String toString() {
		return super.toString() + "salsemanager [incentive=" + incentive + ", id=" + id + ", name=" + name + ", salary="
				+ salary + "]";
	}
	// Calculate Salary

	double calSalary() {

		return salary + incentive;
	}

} // salsemanager class ends here
