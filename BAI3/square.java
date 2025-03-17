package BAI3;

public class square extends rectangle{
    public square(){
        super();
    }
    public square(double side){
        super(side, side, "red", true);
    }
    public square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setWidth(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public void setLength(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    @Override
    public String toString(){
        return "square(" + super.toString() + ")";
    }

}
