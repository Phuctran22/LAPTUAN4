package BAI1;

public class Cylinder extends Circle {
    private double height =1.0;

    public Cylinder(){
        super();
        this.height=1.0;
    }

    public Cylinder(double radius) {
        super();
        this.height = 1.0;
    }

    public Cylinder(double radius, double height){
        super();
        this.height=height;
    }

    public Cylinder(double radius, double height, String color){
        super();
        this.height=height;
        this.color="red";
    }

    public double getHeight() {
        return height;
        }
    public void setHeight(double height){
        this.height=height;
    }

    public double getVolume() {
        return getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder(" + super.toString() + ", height=" + height + ")";
    }
}
