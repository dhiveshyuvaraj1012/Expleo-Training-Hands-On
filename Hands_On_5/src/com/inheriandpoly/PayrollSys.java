package com.inheriandpoly;

class Employee {
	protected String empId;
	protected String empName;
	protected double baseSalary;

	public Employee(String empId, String empName, double baseSalary) {
		this.empId = empId;
		this.empName = empName;
		this.baseSalary = baseSalary;
	}

	public String getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}


	public double calculateSalary() {
		return baseSalary;
	}

	@Override
	public String toString() {
		return "Employee ID: " + empId + "\nName: " + empName + "\nBase Salary: " + baseSalary + "\nFinal Salary: "
				+ calculateSalary();
	}
}

// PermanentEmployee class
class PermanentEmployee extends Employee {
	private double bonus;

	public PermanentEmployee(String empId, String empName, double baseSalary, double bonus) {
		super(empId, empName, baseSalary);
		this.bonus = bonus;
	}

	@Override
	public double calculateSalary() {
		return baseSalary + bonus;
	}

	@Override
	public String toString() {
		return super.toString() + "\nBonus: " + bonus;
	}
}

// ContractEmployee class
class ContractEmployee extends Employee {
	private double taxRate;
	private double serviceCharge;

	public ContractEmployee(String empId, String empName, double baseSalary, double taxRate, double serviceCharge) {
		super(empId, empName, baseSalary);
		this.taxRate = taxRate;
		this.serviceCharge = serviceCharge;
	}

	@Override
	public double calculateSalary() {
		return baseSalary - (baseSalary * taxRate) - serviceCharge;
	}

	@Override
	public String toString() {
		return super.toString() + "\nTax Rate: " + taxRate + "\nService Charge: " + serviceCharge;
	}
}

// Intern class
class Intern extends Employee {
	private double stipend;

	public Intern(String empId, String empName, double stipend) {
		super(empId, empName, 0);
		this.stipend = stipend;
	}

	@Override
	public double calculateSalary() {
		return stipend;
	}

	@Override
	public String toString() {
		return super.toString() + "\nStipend: " + stipend;
	}
}

// Main class
public class PayrollSys {
	public static void main(String[] args) {
		Employee[] employees = new Employee[4];

	
		employees[0] = new Employee("E001", "Generic Employee", 30000);
		employees[1] = new PermanentEmployee("PE001", "Ravi", 50000, 5000);
		employees[2] = new ContractEmployee("CE001", "Ram", 40000, 0.1, 2000);
		employees[3] = new Intern("IN001", "Anita", 15000);

	
		for (Employee e : employees) {
			System.out.println("------------");
			System.out.println(e);
		}
	}
}