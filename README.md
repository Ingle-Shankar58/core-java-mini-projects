💼 Employee Management System (Java Console)
Overview

Java Console-Based Employee Management System

Uses OOP + MVC Architecture

Supports CRUD Operations (Add, Search, Update, Delete, Display All)

Employee Types: HR, Admin, Sales Manager

Project Structure
src/
├─ Model/       (Employee, HR, Admin, SalseManager)
├─ Controller/  (EmployeeContrilar, EmployeeDAO)
├─ View/        (EmployeeView)
└─ TestClass/   (TestApp)

Features

Add Employee (HR/Admin/SalesManager)

Search Employee by ID

Update Salary

Delete Employee by ID

Display All Employees (Menu-Driven)

Employee Types
Type	Extra Field
HR	Commission
Admin	Allowance
Sales Manager	Incentive
Sample Console Menu
1. Add Employee
2. Search Employee
3. Update Employee
4. Delete Employee
5. View All Employee
Enter Choice ==>

Delete Logic (Working)
for (int i = 0; i < count; i++) {
    if (eArr[i].getId() == id) {
        for (int j = i; j < count - 1; j++) eArr[j] = eArr[j + 1];
        eArr[--count] = null;
        return true;
    }
}
return false;

How to Run

Import project in IDE (Eclipse/IntelliJ/VS Code)

Run TestApp.java

Operate via console menu

Future Enhancements

Replace Array with ArrayList / DB

JDBC Database Integration

GUI using Swing / JavaFX

Add Authentication & Unit Tests

Author

Shankar Ingle – Java | OOP | SQL | Mini Project Developer
