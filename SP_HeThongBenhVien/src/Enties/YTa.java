package Enties;

public class YTa extends NhanVienYTe {
	//Thuộc tính
	private String phongTruc;
	
	//Phương thức
	public YTa(String maNV, String hoTen, String gioiTinh, int namSinh,float luongCB, String phongTruc) {
		super(maNV,hoTen,gioiTinh,namSinh,luongCB);
		this.phongTruc = phongTruc;
	}
	
	//Phương thức chung
	public double tinhLuong() {
		return luongCB*500000f;
	}

}
