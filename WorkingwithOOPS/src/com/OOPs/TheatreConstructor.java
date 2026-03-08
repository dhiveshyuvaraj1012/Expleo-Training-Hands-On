package com.OOPs;

public class TheatreConstructor {
    int theatreId;
    String theatreName;
    int totalTheatreScreens;
    String theatreloc;

    // Parameterized constructor
    TheatreConstructor(int tId, String tname, int tscreens, String tloc) {
        theatreId = tId;
        theatreName = tname;
        totalTheatreScreens = tscreens;
        theatreloc = tloc;
    }
    void displayInfo() {
        System.out.println("---Details----");
        System.out.println("Theatre ID: " + theatreId);
        System.out.println("Theatre Name: " + theatreName);
        System.out.println("Total Screens: " + totalTheatreScreens);
        System.out.println("Location: " + theatreloc);
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        TheatreConstructor t1 = new TheatreConstructor(101, "KS Cinema", 5, "Salem");
        TheatreConstructor t2 = new TheatreConstructor(102, "PVR", 8, "Chennai");

        t1.displayInfo();
        t2.displayInfo();
    }
}
