package creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> listOfShapes = new ArrayList<>();

        Circle circle = new Circle();
        circle.setColor("red");
        circle.setRadius(10);

        listOfShapes.add(circle);
        listOfShapes.add(circle.clone());

        Rectangle rectangle = new Rectangle();
        rectangle.setX(10);
        rectangle.setY(20);
        rectangle.setColor("green");

        listOfShapes.add(rectangle);
        listOfShapes.add(rectangle.clone());

        for (Shape s : listOfShapes) {
            System.out.println(s.hashCode());
            System.out.println(s);
        }

    }
}
