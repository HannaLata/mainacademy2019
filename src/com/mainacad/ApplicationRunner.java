package com.mainacad;

import com.mainacad.triangle.Triangle;

public class ApplicationRunner {




    public static void main(String[] args) {

        Triangle triangle10 = new Triangle();
        triangle10.setSide(15.0);
        triangle10.setHeight(17.0);

        System.out.println(
                "Triangle with " +
                "side " + triangle10.getSide() + " and " +
                        "height " + triangle10.getHeight() +
                        " has area " + triangle10.getArea());


    }
}
