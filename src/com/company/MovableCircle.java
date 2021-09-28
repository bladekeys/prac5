package com.company;

public class MovableCircle extends Circle implements Movable{
    public MovableCircle(Point center, double radius) {
        super(center, radius);
    }

    @Override
    public void move(int x, int y) {
        this.center.setX(center.getX()+x);
        this.center.setY(center.getY()+y);
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "center=" + center +
                '}';
    }
}
