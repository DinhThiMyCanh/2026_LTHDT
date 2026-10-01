package Enties;

import java.util.Date;

public class BacSi extends NhanVienYTe {
	//Thuộc tính
	private String chuyenKhoa;
	
	
	//Phương thức
	public BacSi() {
		super();
		this.chuyenKhoa = "";
	}
	
	public BacSi(String maNV, String hoTen, String gioiTinh, Date ngaySinh, float luongCB, String chuyenKhoa) {
		super(maNV,hoTen,gioiTinh,ngaySinh,luongCB);
		this.chuyenKhoa = chuyenKhoa;
	}
	
	public String getChuyenKhoa() {
		return chuyenKhoa;
	}
	public void setChuyenKhoa(String chuyenKhoa) {
		this.chuyenKhoa = chuyenKhoa;
	}
	
	//Phương thức riêng
	public void khamBenh() {
		System.out.println("Bac si:"+ getHoTen() + " đang kham benh");
	}
	
	//Phương thức chung
	@Override
	public double tinhLuong() {
		return luongCB*20000000f;
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("Chuyen khoa:"+chuyenKhoa);
	}
	
	public void keDon(DonThuoc dt, Thuoc t) {
		System.out.println("Bac si:"+getHoTen()+" yeu cau them thuoc vao:" );
		dt.themThuoc(t);
	}
	//Phương thức xác định loại nhân viên
	public String loaiNV() {
		return "BS";
	}

}


