package org.aitkulov.maven.task;

import org.aitkulov.maven.task.manipulation.GeometricQuantities;
import org.aitkulov.maven.task.manipulation.ShapeUtils;
import org.aitkulov.maven.task.shape.Circle;
import org.aitkulov.maven.task.shape.Rectangle;
import org.aitkulov.maven.task.shape.Shape;
import org.aitkulov.maven.task.shape.Triangle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        printAreaAndPerimeterInfo(Circle.class.getSimpleName(), circle);

        Rectangle rectangle = new Rectangle(5, 10);
        printAreaAndPerimeterInfo(Rectangle.class.getSimpleName(), rectangle);

        Triangle triangle = new Triangle(5, 12, 15);
        printAreaAndPerimeterInfo(Triangle.class.getSimpleName(), triangle);

        String resultOfComparing1 = ShapeUtils.compareByQuantityAndGetInfo(rectangle, circle, GeometricQuantities.AREA);
        String resultOfComparing2 = ShapeUtils.compareByQuantityAndGetInfo(rectangle, circle, GeometricQuantities.PERIMETER);

        System.out.println(resultOfComparing1);
        System.out.println(resultOfComparing2);
    }

    private static void printAreaAndPerimeterInfo(String shapeName, Shape shapeToProcess) {
        System.out.println("Area of " + shapeName + " is " + shapeToProcess.calculateArea());
        System.out.println("Perimeter of " + shapeName + " is " + shapeToProcess.calculatePerimeter() + "\n");
    }
}