package com.OOPs;

class ProjectLeader {   //Parent class
	String proleadname = "Ravi";
	int empId = 101;
}
class Programmer extends ProjectLeader {//Child class
	String progName;
	int empId;
	void setData (String name, int id){ //derived class method
		progName = name;
		empId = id;
	}
	 void displayData() {
		System.out.println("Programmer name: " +progName);
		System.out.println("Id:" +empId);
		System.out.println("Project leader name: " +super.proleadname);
		System.out.println("Project id:" +super.empId);
	}
	}
public class InheritanceDemo{
	public static void main(String[] args) {
		Programmer p1 = new Programmer();
		p1.setData("Ram",102);
		p1.displayData();
	}
	
}

