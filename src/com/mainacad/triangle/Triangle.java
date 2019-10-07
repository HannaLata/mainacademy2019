package com.mainacad.triangle;

public class Triangle {

    private double side;
    private double height;

    public double getSide() {
        return side;
    }

    public double getHeight() {
        return height;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {return side*height/2;
    }

}
