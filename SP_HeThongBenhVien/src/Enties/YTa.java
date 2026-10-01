package Enties;

import java.util.Date;

public class YTa extends NhanVienYTe {
	//Thuộc tính
	private String phongTruc;
	
	//Phương thức
	public YTa() {
		super();
		this.phongTruc ="";
	}
	public YTa(String maNV, String hoTen, String gioiTinh, Date ngaySinh,float luongCB, String phongTruc) {
		super(maNV,hoTen,gioiTinh,ngaySinh,luongCB);
		this.phongTruc = phongTruc;
	}
	
	//Phương thức chung
	@Override
	public double tinhLuong() {
		return luongCB*500000f;
	}
	//Phương thức riêng
	public void chamSocBenhNhan() {
		System.out.println("Dang cham soc benh nhan tai phong:"+this.phongTruc);
	}
	//Phương thức xác định loại nhân viên
	public String loaiNV() {
		return "Y";
	}

}
