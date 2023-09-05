package org.example;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectange rectange = (Rectange) o;
        return Double.compare(length, rectange.length) == 0 && Double.compare(height, rectange.height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, height);
    }
}
