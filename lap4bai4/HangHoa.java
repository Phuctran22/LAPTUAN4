package lap4bai4;

import java.util.Scanner;

public class HangHoa {
protected String maHang;
    protected String tenHang;
    protected long donGia;
    
    public HangHoa() {
        this.maHang = "";
        this.tenHang = "";
        this.donGia = 0;
    }
    
    public HangHoa(String maHang, String tenHang, long donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
    }
    
    public String getMaHang() {
        return maHang;
    }
    
    public String getTenHang() {
        return tenHang;
    }
    
    public long getDonGia() {
        return donGia;
    }
    
    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = scanner.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = scanner.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = scanner.nextLong();
        scanner.nextLine();
    }
    
    public void xuat() {
        System.out.println("Ma hang: " + maHang);
        System.out.println("Ten hang: " + tenHang);
        System.out.println("Don gia: " + donGia);
    }
}
