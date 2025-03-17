package BAI3;

public class Main {
    public static void main(String[] args) {
        circle c = new circle(1.0, "red", true);
        System.out.println(c);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println();

        square s = new square(2.0, "blue", false);
        System.out.println(s);
        System.out.println("Area: " + s.getArea());
        System.out.println("Perimeter: " + s.getPerimeter());
        System.out.println();
    }
}
