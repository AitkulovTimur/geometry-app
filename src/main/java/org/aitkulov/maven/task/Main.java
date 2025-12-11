package org.aitkulov.maven.task;

import org.aitkulov.maven.task.manipulation.GeometricQuantities;
import org.aitkulov.maven.task.manipulation.ShapeUtils;
import org.aitkulov.maven.task.shape.Circle;
import org.aitkulov.maven.task.shape.Cube;
import org.aitkulov.maven.task.shape.Rectangle;
import org.aitkulov.maven.task.shape.RectangularPrism;
import org.aitkulov.maven.task.shape.Sphere;
import org.aitkulov.maven.task.shape.ThreeDShape;
import org.aitkulov.maven.task.shape.Triangle;
import org.aitkulov.maven.task.shape.TriangularPrism;
import org.aitkulov.maven.task.shape.TwoDShape;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------------------------two dimensional shapes test------------------------------");
        testTwoDimensionalShape();
        System.out.println("------------------------------three dimensional shapes test------------------------------");
        testThreeDimensionalShape();
    }

    private static void testTwoDimensionalShape() {
        Circle circle = new Circle(5);
        printAreaAndPerimeterInfo(Circle.class.getSimpleName(), circle);

        Rectangle rectangle = new Rectangle(5, 10);
        printAreaAndPerimeterInfo(Rectangle.class.getSimpleName(), rectangle);

        Triangle triangle = new Triangle(5, 12, 15);
        printAreaAndPerimeterInfo(Triangle.class.getSimpleName(), triangle);

        String resultOfComparing1 = ShapeUtils.compareByQuantityAndGetInfo(rectangle, circle, GeometricQuantities.AREA);
        String resultOfComparing2 = ShapeUtils.compareByQuantityAndGetInfo(rectangle, circle, GeometricQuantities.PERIMETER);

        System.out.println(resultOfComparing1);
        System.out.println("\n");
        System.out.println(resultOfComparing2);
        System.out.println("\n");
    }

    private static void printAreaAndPerimeterInfo(String shapeName, TwoDShape shapeToProcess) {
        System.out.println("Area of " + shapeName + " is " + shapeToProcess.calculateArea());
        System.out.println("Perimeter of " + shapeName + " is " + shapeToProcess.calculatePerimeter() + "\n");
    }

    private static void testThreeDimensionalShape() {
        Sphere sphere = new Sphere(5);
        printVolumeAndSurfaceArea(Sphere.class.getSimpleName(), sphere);

        Cube cube = new Cube(5);
        printVolumeAndSurfaceArea(Cube.class.getSimpleName(), cube);

        RectangularPrism cylinder = new RectangularPrism(10, 15, 20);
        printVolumeAndSurfaceArea(RectangularPrism.class.getSimpleName(), cylinder);

        Triangle triangle = new Triangle(5, 12, 15);
        TriangularPrism pyramid = new TriangularPrism(triangle, 10);
        printVolumeAndSurfaceArea(Triangle.class.getSimpleName(), pyramid);

    }

    private static void printVolumeAndSurfaceArea(String shapeName, ThreeDShape shapeToProcess) {
        System.out.println("Volume of " + shapeName + " is " + shapeToProcess.calculateVolume());
        System.out.println("Surface area of " + shapeName + " is " + shapeToProcess.calculateSurfaceArea() + "\n");
    }
}