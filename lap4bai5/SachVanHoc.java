package lap4bai5;

import java.util.Scanner;

public class SachVanHoc extends Sach{
private int lanXuatBan;
    
    public SachVanHoc() {
        super();
        this.lanXuatBan = 0;
    }
    
    public SachVanHoc(String maSach, String tenSach, String tacGia, long gia, int lanXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lanXuatBan = lanXuatBan;
    }
   
    public int getLanXuatBan() {
        return lanXuatBan;
    }
    
    @Override
    public long getGiaSauGiam() {
        if (getGia() > 300000) {
            return (long) (getGia() * 0.8);
        }
        return getGia();
    }
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap lan xuat ban: ");
        lanXuatBan = scanner.nextInt();
        scanner.nextLine();
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Lan xuat ban: " + lanXuatBan);
    }
}
