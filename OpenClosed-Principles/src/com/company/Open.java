package com.company;

public class Open {

    // Main driver method


    public static void main(String args[]) {
        // Initializing a cuboid one & declaring dimensions by
        // creating an object of Cuboid class in main() method
        Cuboid cb1 = new Cuboid();
        int j = cb1.getlength() * cb1.getbreadth() * cb1.getheight();



        Application app = new Application();


        // Print and Display the Total Volume
        System.out.println(j);
    }
}
