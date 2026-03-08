package com.OOPs;

public class EmployeeArrayObj {

    int theatreId;
    String theatreName;
    int totalScreens;
    String location;
    String theatreAddress;

    // Method to set theatre details
    public void setTheatre(int id, String name, int count, String address, String loc) {
        theatreId = id;
        theatreName = name;
        totalScreens = count;
        theatreAddress = address;
        location = loc;
    }

    // Method to display theatre details
    public void getTheatreDetails() {
        System.out.println("----Theatre Details---");
        System.out.println("Theatre ID: " + theatreId);
        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Total Screens: " + totalScreens);
        System.out.println("Location: " + location);
        System.out.println("Address: " + theatreAddress);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        // Create an array of 3 theatres
        EmployeeArrayObj[] theatres = new EmployeeArrayObj[3];

        // Initialize objects
        for (int i = 0; i < theatres.length; i++) {
            theatres[i] = new EmployeeArrayObj();
        }

        // Set theatre details
        theatres[0].setTheatre(101, "KS Cinema", 5, "MG Road, Salem", "Salem");
        theatres[1].setTheatre(102, "PVR Cinema", 8, "Main Street, Chennai", "Chennai");
        theatres[2].setTheatre(103, "INOX", 6, "Park Avenue, Coimbatore", "Coimbatore");

        // Display theatre details
        for (int i = 0; i < theatres.length; i++) {
            theatres[i].getTheatreDetails();
        }
    }
}
