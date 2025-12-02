package Model;

public class HR extends Employee {

	double commission;

	// Default constructor
	HR() {

		super();
		this.commission = 1000;

	}

	// Parameterized Constructor

	public HR(int id, String name, double salary, double commission) {

		super(id, name, salary);
		this.commission = commission;

	}

	// Getters and Setters

	double getCommission() {
		return commission;
	}

	void setCommission(double commission) {
		this.commission = commission;
	}

	// Display
	@Override
	public String toString() {
		return super.toString() + "\ncommission=" + commission + "\n----------------------------------";
	}

	// Calculate Salary

	double calSalary() {

		return salary + commission;
	}

} // class hr ends here
