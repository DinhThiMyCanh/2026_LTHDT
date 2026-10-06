package Entities;

import java.util.Date;

public class BacSi extends NhanVienYTe {
	//Thuộc tính
	private String chuyenNganh;
	
	//Phương thức
	public BacSi() {
		super();
		this.chuyenNganh ="";
	}
	
	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public BacSi(String maNV, String hoTen, String gioiTinh, Date ngaySinh, float luongCB, String chuyenNganh) {
		super(maNV, hoTen, gioiTinh,ngaySinh,luongCB);
		this.chuyenNganh = chuyenNganh;
	}
	
	//Phương thức riêng
	@Override
	public void khamBenh() {
		System.out.println("Bac si "+ hoTen+" dang kham benh");
	}
	
	//Phương thức chung
	@Override
	public double tinhLuong() {
		return this.luongCB*10000000;
	}
	
	public void keDon(DonThuoc dt, Thuoc t) {
		System.out.println("Bac si:"+getHoTen()+ " gui yeu cau ke don:");
		dt.themThuoc(t);
	}
	
	public String loaiNV() {
		return "BS";
	}

	@Override
	public String toString() {
		return super.toString() + "BacSi [chuyenNganh=" + chuyenNganh + "]";
	}
	
}
