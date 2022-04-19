package com.company;

public class Circle {
    private double radius;
    private String color;

    public Circle(){


    }
    public Circle(double r){
        radius = r;
        color = "red";
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
}
