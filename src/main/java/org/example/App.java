package org.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import static java.util.Collections.sort;

public class App {
    public static void main(String[] args) {

        ArrayList<Shape> myShapesList = new ArrayList<>();
        myShapesList.add(new Circle(2.0));
        myShapesList.add(new Circle(3.0));
        myShapesList.add(new Circle(1.5));
        myShapesList.add(new Rectange(1.5, 2.5));
        myShapesList.add(new Rectange(1, 1));
        myShapesList.add(new Rectange(3, 3));
        System.out.println("unsorted list:");
        System.out.println(myShapesList);
        Collections.sort(myShapesList);
        System.out.println("sorted list:");
        System.out.println(myShapesList);
        
    }
}
