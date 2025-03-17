package BAI3;

public class Main {
    public static void main(String[] args) {

        shape shape = new shape("blue", false);
  
        System.out.println(shape);

        circle circle = new circle(2.0, "green", true);

        System.out.println(circle);

        System.out.println("Area: " + circle.getArea());

        System.out.println("Perimeter: " + circle.getPerimeter());

        rectangle rectangle = new rectangle(3.0, 4.0, "yellow", false);

        System.out.println(rectangle);

        System.out.println("Area: " + rectangle.getArea());

        System.out.println("Perimeter: " + rectangle.getPerimeter());

        square square = new square(2.5, "purple", true);

        System.out.println(square);

        System.out.println("Area: " + square.getArea());

        System.out.println("Perimeter: " + square.getPerimeter());
    }
}
