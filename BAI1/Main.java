package BAI1;

public class Main {
    public static void main(String[] args) {
        // Tạo một đối tượng Circle với radius = 2.0 và color = "blue"
        Circle circle = new Circle(2.0, "blue");
        
        // In thông tin của Circle
        System.out.println("Thong tin Circle:");
        System.out.println(circle.toString());
        
        // In diện tích của Circle
        System.out.println("Dien tich Circle: " + circle.getArea());
        
        // Tạo một đối tượng Cylinder với radius = 2.0, height = 3.0, color = "green"
        Cylinder cylinder = new Cylinder(2.0, 3.0, "green");
        
        // In thông tin của Cylinder
        System.out.println("\nThong tin Cylinder:");
        System.out.println(cylinder.toString());
        
        // In thể tích của Cylinder
        System.out.println("The tich Cylinder: " + cylinder.getVolume());
    }

}
