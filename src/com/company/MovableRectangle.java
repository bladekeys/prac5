package com.company;

public class MovableRectangle extends Rectangle implements Movable{
    private boolean check;

    public MovableRectangle(Point upperleft, Point lowerright) {
        super(upperleft, lowerright);

    }
    public void check() throws Exception {
        if ((Math.abs(this.upperleft.getX()- this.lowerright.getX())==this.lenght) & (Math.abs(upperleft.getY()-lowerright.getY())==this.width)){
        } else {
            throw new Exception("Наш прямугольник не валиден после перемещения");
        }

    }

    @Override
    public void move(int x, int y) throws Exception {
        this.upperleft.setX(upperleft.getX()+x);
        this.upperleft.setY(upperleft.getY()+y);
        this.lowerright.setX(lowerright.getX()+x);
        this.lowerright.setY(lowerright.getY()+y);
        check();

    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "check=" + check +
                ", upperleft=" + upperleft +
                ", lowerright=" + lowerright +
                '}';
    }
}
