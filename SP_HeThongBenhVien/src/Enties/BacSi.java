package Enties;

public class BacSi extends NhanVienYTe {
	//Thuộc tính
	private String chuyenKhoa;
	
	
	//Phương thức
	public BacSi(String maNV, String hoTen, String gioiTinh, int namSinh, float luongCB, String chuyenKhoa) {
		super(maNV,hoTen,gioiTinh,namSinh,luongCB);
		this.chuyenKhoa = chuyenKhoa;
	}
	
	
	//Phương thức riêng
	public void khamBenh() {
		System.out.println("Bac si:"+ getHoTen() + " đang kham benh");
	}
	
	//Phương thức chung
	public double tinhLuong() {
		return luongCB*20000000f;
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("Chuyen khoa:"+chuyenKhoa);
	}

}


