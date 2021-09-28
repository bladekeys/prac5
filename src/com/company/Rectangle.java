package com.company;

public class Rectangle {
    protected Point upperleft;
    protected Point lowerright;
    protected int lenght;
    protected int width;

    public Rectangle(Point upperleft, Point lowerright) {
        this.upperleft = upperleft;
        this.lowerright = lowerright;
    }

    public void check() throws Exception {
        lenght= Math.abs(upperleft.getX()- lowerright.getX());
        width=Math.abs(upperleft.getY()-lowerright.getY());
    }
}
