package Entities;

import java.util.Date;

public class YTa extends NhanVienYTe {
	//Thuộc tính
	private String phongTruc;
	
	//Phương thức
	public YTa() {
		super();
		this.phongTruc ="";
	}
	public YTa(String maNV, String hoTen, String gioiTinh, Date ngaySinh, float luongCB, String phongTruc) {
		super(maNV, hoTen, gioiTinh,ngaySinh, luongCB);
		this.phongTruc = phongTruc;
	}
	
	
	public String getPhongTruc() {
		return phongTruc;
	}
	public void setPhongTruc(String phongTruc) {
		this.phongTruc = phongTruc;
	}
	//Phương thức chung
	@Override
	public double tinhLuong() {
		return this.luongCB*3000000;
	}
	
	@Override 
	public void hienThi() {
		super.hienThi(); //Kế thừa lớp cha
		System.out.println("Gioi tinh:"+ gioiTinh);
	}
	//Phương thức riêng
	@Override
	public void chamSocBenhNhan() {
		System.out.println("Đang cham soc benh nhan tai phong:"+ this.phongTruc);
	}
}
