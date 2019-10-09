package com.mainacad;

import com.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.square.Square;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {




    public static void main(String[] args) {

        Triangle triangle = new Triangle();
        triangle.setSide(17);
        triangle.setHeight(29);
        Circle circle = new Circle();
        circle.setRadius(16);
        Square square = new Square();
        square.setSide(18);

        Shape minShape;
        if (circle.getArea() < square.getArea()) {
            minShape = circle;
        } else {
            minShape = square;
        }
        if (minShape.getArea() > triangle.getArea()) {
            minShape = triangle;
        }
        System.out.println("Min shape has area " + minShape.getArea());

    } }
