package Entities;

public class NhanVienYTe {
	//Thuộc tính
	protected String maNV;
	protected String hoTen;
	protected String gioiTinh;
	protected float luongCB;
		
	
	//Phương thức
	public NhanVienYTe() {
		this.maNV = "";
		this.hoTen = "";
		this.gioiTinh = "";
		this.luongCB = 0.0f;
	}
	public NhanVienYTe(String maNV, String hoTen, String gioiTinh,float luongCB) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
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
		System.out.println("Ma nhan vien:"+getMaNV()+ " ho ten:"+ getHoTen()+ " luong:"+ tinhLuong());
	}
	public void khamBenh() {
		System.out.print("");
	}
	public void chamSocBenhNhan() {
		System.out.print("");
	}
		

}
