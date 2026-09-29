package Entities;

import java.util.Date;

public class NhanVienYTe {
	//Thuộc tính
	protected String maNV;
	protected String hoTen;
	protected String gioiTinh;
	protected Date ngaySinh;
	protected float luongCB;
		
	
	//Phương thức
	public NhanVienYTe() {
		this.maNV = "";
		this.hoTen = "";
		this.gioiTinh = "";
		this.ngaySinh = new Date();
		this.luongCB = 0.0f;
	}
	public NhanVienYTe(String maNV, String hoTen, String gioiTinh,Date ngaySinh, float luongCB) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.ngaySinh = ngaySinh;
		this.luongCB = luongCB;
	}
	
	public String getMaNV() {
		return this.maNV;
	}
	
	
	public String getGioiTinh() {
		return gioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}
	public float getLuongCB() {
		return luongCB;
	}
	public void setLuongCB(float luongCB) {
		this.luongCB = luongCB;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getHoTen() {
		return this.hoTen;
	}
	
	public Date getNgaySinh() {
		return ngaySinh;
	}
	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}
	public void setHoTen(String hoTen) {
		if (hoTen != null && !hoTen.trim().isEmpty()) {
			this.hoTen = hoTen;
		}
		else {
			System.out.println("Nhap ho ten khong hop le!");
		}
	}
	
	public double tinhLuong() {
		return 0;
	}
	
	public void hienThi() {
		System.out.println("Ma nhan vien:"+getMaNV());
		System.out.println("Ho ten:"+ getHoTen());
		System.out.println("Gioi tinh:"+getGioiTinh());
		System.out.println("Ngay Sinh:"+ getNgaySinh()+" Tuoi:"+tinhTuoi());
		System.out.println("Luong:"+ tinhLuong());
	}
	public void khamBenh() {
		
	}
	public void chamSocBenhNhan() {
		
	}
	public void keDon(DonThuoc dt, Thuoc t) {
	}
	
	//Tinh tuoi cho nhan vien
	public int tinhTuoi() {
		Date d = new Date();
		int y = d.getYear();
		int ns = ngaySinh.getYear();
		return y-ns;
	}

}
