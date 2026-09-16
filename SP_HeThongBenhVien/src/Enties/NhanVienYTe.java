package Enties;

public class NhanVienYTe {
	protected String maNV;
	protected String hoTen;
	protected String gioiTinh;
	protected int namSinh;
	protected float luongCB;
	
	//Phương thức
	public NhanVienYTe(String maNV, String hoTen, String gioiTinh, int namSinh, float luongCB) {
		this.maNV = maNV;
	    this.hoTen = hoTen;
		this.gioiTinh = gioiTinh;
		this.namSinh = namSinh;
		this.luongCB = luongCB;
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
		System.out.println("Ma Nhan vien:"+ maNV + " Ho ten:"+ hoTen + " Luong:"+ tinhLuong());
	}

}
