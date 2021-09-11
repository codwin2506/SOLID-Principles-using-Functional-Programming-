package com.company;

public class Cuboid {

    // Member variables
    public int length;
    public int breadth;
    public int height;

    public void setlength(int length)
    {
        this.length=length;
    }
    public void setbreadth(int breadth)
    {
        this.breadth=breadth;
    }
    public void setheight(int height)
    {
        this.height=height;
    }

    public int getlength()
    {return  this.length;}

    public int getbreadth()
    {return this.breadth;}

    public int getheight()
    {return this.height;}

    Cuboid(){
        setlength(2);
        setbreadth(4);
        setheight(8);
    }
    // Custom entries


}
