package com.classandobjandencap;
import java.time.LocalTime;
class Employee {
	private int empId;
	private String empName;
	private Attendance attend;
	//Constructors
	Employee(int empId,String empName) {
		this.empId = empId;
		this.empName = empName;
		this.attend = new Attendance(empId);
	}
	//Setter method
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	//Method Declaration
	public void markCheckIn() {
		attend.markCheckIn();
}
	public void markCheckOut() {
		attend.markCheckOut();
	}
	public void getAttendanceDetails() {
		System.out.println("Name: " + empName);
		attend.getAttendanceDetails();
}
}
class Attendance{
	private int empId;
	private LocalTime checkInTime;
	private LocalTime checkOutTime;
	
	private boolean isCheckedIn;
	private boolean isCheckedOut;
	//Constructor
	Attendance(int EmpId) {
		this.empId = empId;
	}
	public void markCheckIn() {
		if(isCheckedIn) {
			System.out.print("Already Checked In");
		} else {
			checkInTime = LocalTime.now();
			isCheckedIn = true;
		
	}
	}
	public void markCheckOut() {
		if(isCheckedOut) {
			System.out.print("Already Checked Out");
		}
		else if (!isCheckedIn) {
			System.out.print("Not checked in");
		}else {
			checkOutTime = LocalTime.now();
			isCheckedOut = true;
		}
	}
		
	public void getAttendanceDetails() {
		System.out.println("Is checked in:" +isCheckedIn);
		System.out.println("Checked in Time:" +checkInTime);
		System.out.println("Is checked out:" +isCheckedOut);
		System.out.println("Checked out time:" +checkOutTime);
		
	}
	
}
public class EmployeeAttendanceSystem{
	public static void main(String[] args) {
		Employee e1 = new Employee(100,"Adam");
		e1.markCheckIn();
		e1.markCheckOut();
		e1.getAttendanceDetails();
	}
}

	

