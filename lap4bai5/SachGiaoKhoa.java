package lap4bai5;

import java.util.Scanner;

public class SachGiaoKhoa extends Sach{
private int lop;
    private String nhaXuatBan;
    
    public SachGiaoKhoa() {
        super();
        this.lop = 0;
        this.nhaXuatBan = "";
    }
    
    public SachGiaoKhoa(String maSach, String tenSach, String tacGia, long gia, 
                       int lop, String nhaXuatBan) {
        super(maSach, tenSach, tacGia, gia);
        this.lop = lop;
        this.nhaXuatBan = nhaXuatBan;
    }
    
    public int getLop() {
        return lop;
    }
    
    public String getNhaXuatBan() {
        return nhaXuatBan;
    }
    
    @Override
    public long getGiaSauGiam() {
        if (nhaXuatBan.equalsIgnoreCase("Giao Duc")) {
            return (long) (getGia() * 0.9);
        }
        return getGia();
    }
    
    @Override
    public void nhap() {
        super.nhap();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap lop: ");
        lop = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap nha xuat ban: ");
        nhaXuatBan = scanner.nextLine();
    }
    
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Lop: " + lop);
        System.out.println("Nha xuat ban: " + nhaXuatBan);
    }
}
