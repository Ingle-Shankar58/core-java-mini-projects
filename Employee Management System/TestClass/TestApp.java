package TestClass;

import Controller.EmployeeContrilar;
import View.EmployeeView;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeContrilar ec=new EmployeeContrilar();
		EmployeeView view=new EmployeeView(ec);
		view.ShowOption();
	}

}
