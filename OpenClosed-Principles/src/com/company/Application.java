package com.company;

class Application extends Cuboid {

    public void setlength(int length) {
        this.length = length;
    }

    public void setbreadth(int breadth) {
        this.breadth = breadth;
    }

    public void setheight(int height) {
        this.height = height;
    }

    Application() {
        setlength(2);
        setbreadth(2);
        setheight(2);
    }

    // It returns the total volume of the geometric objects

}
