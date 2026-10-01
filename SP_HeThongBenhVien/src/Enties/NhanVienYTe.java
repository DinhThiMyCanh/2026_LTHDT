package Enties;

import java.util.Date;

public class NhanVienYTe {
	
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
	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		
		this.gioiTinh = gioiTinh;
	}

	public Date getngaySinh() {
		return this.ngaySinh;
	}

	public void setNamSinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
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
	public String getMaNV() {
		return this.maNV;
	}
	
	public void setHoTen(String hoTen) {
		if (hoTen !=null && !hoTen.trim().isEmpty()) {
			this.hoTen = hoTen;
		}
		else {
			System.out.println("Du lieu ho ten khong hop le!");
		}
	}
	
	public double tinhLuong() {
		return 0;
	}
	
	public void hienThi() {
		System.out.println("Ma Nhan vien:"+ maNV + " Ho ten:"+ hoTen + " Tuoi:"+tinhTuoi() +" Luong:"+ tinhLuong());
	}
	public void khamBenh() {
		System.out.print("");
	}
	public void chamSocBenhNhan() {
		System.out.print("");
	}
	public void keDon(DonThuoc dt, Thuoc t) {
		
	}
	//Tính tuổi cho nhân viên
	public int tinhTuoi() {
		Date d = new Date();
		return d.getYear()-ngaySinh.getYear();
	}
	
	//Tách tên nhân viên
	/*public String getTen() {
		String [] cacTu = this.hoTen.split(" ");
		int l = cacTu.length;
		return cacTu[l-1];
	}*/
	
	//Tách  họ
	public String getHo() {
		int vt = this.hoTen.indexOf(" ");
		return this.hoTen.substring(0, vt);
	}
	//Tách phần đệm
	public String getDem() {
		int vt1 = this.hoTen.indexOf(" ");
		int vt2 = this.hoTen.lastIndexOf(" ");
		return this.hoTen.substring(vt1+1,vt2);
	}
	//Tách tên
	public String getTen() {
		int vt = this.hoTen.lastIndexOf(" ");
		return this.hoTen.substring(vt+1);
	}
	
	//Phương thức xác định loại nhân viên
	public String loaiNV() {
		return "";
	}
	
}
