package BAI3;

public class shape {
    private String color="red";
    private boolean filled=true;

public shape(){
    this.color="red";
    this.filled=true;
}

public shape(String color, boolean filled){
    this.color="red";
    this.filled=true;
}

public String getColor(){
    return color;
}
public void setColor(String color){
    this.color=color;
}

public boolean isFilled() {
    return filled;
}
public void setFilled(boolean filled){
    this.filled=filled;
}
@Override
public String toString(){
    return "shape(color= " + color + ", filled= " + filled + ")";
}
}