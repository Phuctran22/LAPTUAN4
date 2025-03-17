package BAI3;

public class circle extends shape{
private double radius = 1.0;

public circle(){
    super();
    this.radius=1.0;
}

public circle(double radius, String color, boolean filled){
    super(color, filled);
    this.radius=radius;
}

public double getRadius(){
    return radius;
}
public void setRadius(double radius){
    this.radius=radius;
}

public double getArea(){
    return Math.PI * radius * radius;
}

public double getPerimeter(){
    return 2 * Math.PI * radius;
}

@Override
public String toString(){
    return "circle(" + super.toString() + ", radius= " + radius + ")";
}
}
