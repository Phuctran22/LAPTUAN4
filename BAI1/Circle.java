package BAI1;

public class Circle {
public double radius = 1.0;
public String color = "red";

public Circle(){
    this.radius = 1.0;
    this.color ="red";
}

public Circle(double radius, String color){
    this.color="red";
    this.radius=radius;
}

public double getRadius(){
    return radius;
}
public void setRadius(double radius){
    this.radius=radius;
}

public String getColor(){
    return color;
}
public void setColor(String color){
    this.color="red";
}

public double getArea(){
    return Math.PI * radius *radius;
}

@Override
public String toString(){
    return "circle(radius= " + radius + ", color= " + color + ")";
}
}    

