//Method overriding
package com.OOPs;

class Vehicle{
	void run() {
		System.out.println("Vehicle is running");
	}
}
class Truck extends Vehicle{
	void run() {
		System.out.println("Truck is running");
	}
}
public class Overirding {
	public static void main(String[] args) {
		Vehicle obj = new Vehicle();
		obj.run();                 //Vehicle class run() method is invoked
		Vehicle obj1 = new Truck(); //Truck class run() method is invoked
		obj1.run();
	}
}
