package BAI2;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Ng Van A", "HCM");
        System.out.println(person);
        
        // Tạo đối tượng Student
        Student student = new Student("Tran Thi B", "HCM", "CNTT", 2, 1500000.0);
        System.out.println(student);
        
        // Tạo đối tượng Staff
        Staff staff = new Staff("Le Van C", "Da Nang", "DH TN&MT", 12000000.0);
        System.out.println(staff);
        
        // Thử nghiệm các phương thức getter/setter
        student.setProgram("Khoa hoc may tinh");
        student.setYear(3);
        student.setFee(1700000.0);
        System.out.println("Thong tin sv sau khi cap nhat: " + student);
        
        staff.setSchool("DH TN & MT");
        staff.setPay(15000000.0);
        System.out.println("Thong tin sv sau khi cap nhat: " + staff);
    }
}
