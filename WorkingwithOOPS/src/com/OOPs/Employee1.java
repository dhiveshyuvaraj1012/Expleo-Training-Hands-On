package com.OOPs;

public class Employee1 {
    int Empid;
    String Empname;

    // Method to set employee details
    void setEmployeeDetail(int i, String name) {
        this.Empid = i;
        this.Empname = name;
    }

    // Method to get/display employee details
    void getEmployeeDetail() {
        displayInfo();
    }

    // Display method
    void displayInfo() {
        System.out.println("Employee ID: " + Empid);
        System.out.println("Employee Name: " + Empname);
    }

    public static void main(String[] args) {
        Employee1 Emp1 = new Employee1();
        Employee1 Emp2 = new Employee1();

        // Set details
        Emp1.setEmployeeDetail(101, "Ankit");
        Emp2.setEmployeeDetail(102, "Balu");

        // Display details
        Emp1.getEmployeeDetail();
        Emp2.getEmployeeDetail();
    }
}
