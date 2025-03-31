package lap4bai4;

import java.util.Scanner;

public class Demo {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        HangDienMay dienMay = new HangDienMay("DM001", "Tivi", 5000000, 12, 220, 100);
        System.out.println("\nThong tin hang dien may vua tao:");
        dienMay.xuat();
        
        System.out.println("\nNhap thong tin hang dien may moi:");
        dienMay.nhap();
        System.out.println("Thong tin hang dien may sau khi nhap:");
        dienMay.xuat();
        
        HangThucPham thucPham = new HangThucPham("TP001", "Gao", 20000, "01/03/2025", "01/09/2025");
        System.out.println("\nThong tin hang thuc pham vua tao:");
        thucPham.xuat();
        
        System.out.println("\nNhap thong tin hang thuc pham moi:");
        thucPham.nhap();
        System.out.println("Thong tin hang thuc pham sau khi nhap:");
        thucPham.xuat();
        
        scanner.close();
    }
}
