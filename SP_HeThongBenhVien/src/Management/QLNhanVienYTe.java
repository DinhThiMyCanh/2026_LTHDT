package Management;

import Enties.NhanVienYTe;

public class QLNhanVienYTe {
	private NhanVienYTe [] ds;
	private int soNV;
	
	//Phương thức khởi tạo
	public QLNhanVienYTe(int n) {
		ds = new NhanVienYTe[n];
		this.soNV = 0;
	}
	//Thêm nhân viên
	public void themNV(NhanVienYTe nv) {
		if (this.soNV<ds.length) {
			ds[soNV] = nv;
			soNV++;
		}
	}
	//Liệt kê danh sách nhân viên
	public void lietKe() {
		for (int i =0; i<soNV; i++) {
			ds[i].hienThi();
		}
			
	}
	//Liệt kê danh sách nhân viên
	public void lietKe(String l) {
		for (int i =0; i<soNV; i++) 
			if (ds[i].loaiNV().equals(l)){
				ds[i].hienThi();
			}
			
	}
}
