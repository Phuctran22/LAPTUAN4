package BAI2;

public class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(){
        super();
        this.fee=0;
        this.year=0;
        this.program="";
    }

    public Student(String name, String address, String program, int year, double fee){
        super(name, address);
        this.fee=fee;
        this.year=year;
        this.program=program;
    }

    public String getProgram(){
        return program;
    }
    public void setProgram(String program){
        this.program=program;
    }

    public int getYear(){
        return year;
    }
    public void setYear(int year){
        this.year=year;
    } 

    public double getFee(){
        return fee;
    }
    public void setFee(double fee){
        this.fee=fee;
    }

    @Override
    public String toString() {
        return "Student(" + super.toString() + ", program=" + program + ", year=" + year + ", fee=" + fee + ")";
    }
}
