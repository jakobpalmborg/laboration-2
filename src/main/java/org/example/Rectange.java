package org.example;

public class Rectange extends Shape {

    private double length;
    private double height;

    public Rectange(double length, double height) {
        this.length = length;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return length * height;
    }

    @Override
    public double getPerimeter() {
        return length * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectange{" +
                "length=" + length +
                ", height=" + height +
                '}';
    }

   }
