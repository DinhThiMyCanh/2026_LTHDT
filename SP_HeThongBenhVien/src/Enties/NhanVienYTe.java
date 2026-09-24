package Enties;

public class NhanVienYTe {
	
	protected String maNV;
	protected String hoTen;
	protected String gioiTinh;
	protected int namSinh;
	protected float luongCB;
	
	//Phương thức
	public NhanVienYTe() {
		this.maNV = "";
	    this.hoTen = "";
		this.gioiTinh = "";
		this.namSinh = 0;
		this.luongCB = 0.0f;
	}
	
	
	public NhanVienYTe(String maNV, String hoTen, String gioiTinh, int namSinh, float luongCB) {
		this.maNV = maNV;
	    this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.luongCB = luongCB;
	}
	public String getGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
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
	
	public static double tinhLuong() {
		return 0;
	}
	
	public void hienThi() {
		System.out.println("Ma Nhan vien:"+ maNV + " Ho ten:"+ hoTen + " Luong:"+ tinhLuong());
	}
	public void khamBenh() {
		System.out.print("");
	}
	public void chamSocBenhNhan() {
		System.out.print("");
	}
	public void keDon(DonThuoc dt, Thuoc t) {
		
	}
}
