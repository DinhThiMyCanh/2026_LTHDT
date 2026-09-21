package Entities;

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

	public BacSi(String maNV, String hoTen, String gioiTinh, float luongCB, String chuyenNganh) {
		super(maNV, hoTen, gioiTinh, luongCB);
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
	
	
}
