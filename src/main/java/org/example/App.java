package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class App {
    public static void main(String[] args) {

        // ArrayList
        ArrayList<Shape> myShapesList = new ArrayList<>();
        myShapesList.add(new Circle(2.0));
        myShapesList.add(new Circle(3.0));
        myShapesList.add(Shape.createCircle(1.5));
        myShapesList.add(new Rectange(1.5, 2.5));
        myShapesList.add(new Rectange(1, 1));
        myShapesList.add(Shape.createRectange(3, 3));
        System.out.println("Unsorted list:");
        System.out.println(myShapesList);
        Collections.sort(myShapesList);
        System.out.println("Sorted list:");
        System.out.println(myShapesList);

        // HashSet
        HashSet<Shape> myShapesHashSet = new HashSet<>();
        myShapesHashSet.add(Shape.createCircle(5.0));
        myShapesHashSet.add(new Circle(10.0));
        myShapesHashSet.add(new Circle(15.0));
        myShapesHashSet.add(new Circle(10.0));
        myShapesHashSet.add(Shape.createRectange(50.0, 40.0));
        myShapesHashSet.add(new Rectange(100.0, 90.0));
        myShapesHashSet.add(new Rectange(100.0, 90.0));
        myShapesHashSet.add(new Rectange(150.0, 140.0));
        System.out.println("HashSet:");
        System.out.println(myShapesHashSet);

    }
}
