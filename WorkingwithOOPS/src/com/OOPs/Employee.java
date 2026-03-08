package com.OOPs;
/*
 * REFER INSTANCE VARIABLE
 */
public class Employee {
	int empId;
	String empName;
	double empSalary;
	Employee(int empId, String empName, double empSalary){
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		System.out.println("Employee created successfully");
	}
/*
 * REFER ANOTHER CONSTRUCTOR
 */
Employee(){
	this(101,"Default Employee" , 3000);
	System.out.println("Default constructor called");
}
//Using this to call another method in the same class
void registerEmployee() {
	System.out.println("Registering Employee");
	this.displayDetails();
}
void displayDetails() {
	System.out.println("Employee ID: " + empId);
	System.out.println("Employee Name: "  +empName);
	System.out.println("Employee Salary: " +empSalary);
}
//Using this to pass current object as an arg
void sendForProcessing() {
	HRDepartment hr = new HRDepartment();
	hr.processEmployee(this);
}
//Using this to return current object (Method Chaining)
Employee updateSalary(double hikePercentage) {
	this.empSalary = empSalary + (empSalary * hikePercentage/100);
	return this;
}
Employee updateName(String newName) {
	this.empName = newName;
	return this;
}
}
//Helper class representing another dept
class HRDepartment{
	void processEmployee(Employee e) {
		System.out.println("HR Dept processing employee");
		System.out.println("Processed Employee: " + e.empName + "with salary " + e.empSalary + "\n");
	}
}
class EmployeeThisKeywordDemo{
	public static void main(String[] args) {
		Employee e = new Employee();
		e.registerEmployee();
		e.sendForProcessing();
		System.out.println("Updating emp details");
		e.updateName("Dhives").updateSalary(15.5).displayDetails();
		e.sendForProcessing();
	}
}
