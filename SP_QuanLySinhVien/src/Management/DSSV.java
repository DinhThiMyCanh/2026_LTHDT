package Management;

import Entities.IKhenThuong;
import Entities.INghienCuuKHoaHoc;
import Entities.SV;

public class DSSV {
	private SV [] ds;
	private int soSV;
	
	//Phương thức khởi tạo
	public DSSV(int n) {
		ds = new SV[n];
		this.soSV = 0;
	}
	//Thêm nhân viên
	public void themSV(SV sv) {
		if (this.soSV<ds.length) {
			ds[soSV] = sv;
			soSV++;
		}
	}
	//Liệt kê danh sách sv
	public void lietKe() {
		for (int i =0; i<soSV; i++) {
			ds[i].hienThi();
		}
			
	}
	//Liệt kê danh sách nhân viên
	public void lietKe(String l) {
		System.out.println("Danh sach sv");
		for (int i =0; i<soSV; i++) 
			if (ds[i].loaiSV().equals(l)){
				ds[i].hienThi();
			}
			
	}
	//Liệt kê danh sách sv được TN
	public void lietKeTN() {
		System.out.println("Danh sach sv duoc tot nghiep");
		for (int i =0; i<soSV; i++) {
			if (ds[i].duocTN())
				ds[i].hienThi();
		}
			
	}
	//Liệt kê các sinh viên được khen thưởng
	public void lietKeKhenThuong() {
		System.out.println("Danh sach sv duoc khen thuong");
		boolean coSV =false;
		for (int i =0; i<soSV; i++) {
			if (ds[i] instanceof IKhenThuong) {
				IKhenThuong svKT= (IKhenThuong) ds[i];
				if (svKT.xetHocBong()) {
					svKT.hienThiHocBong();
					coSV = true;
				}
			}
		}
		if (!coSV) {
			System.out.println("Khong co sv nao du dieu kien de khen thuong");
		}
	}
	//Liệt kê các sinh viên được giai thuong NCKH
		public void lietKeNCKH() {
			System.out.println("Danh sach sv dat giai thuong NCKH");
			boolean coSV =false;
			for (int i =0; i<soSV; i++) {
				if (ds[i] instanceof INghienCuuKHoaHoc) {
					INghienCuuKHoaHoc svNCKH= (INghienCuuKHoaHoc) ds[i];
					if (svNCKH.datGiaiThuongNCKH()) {
						ds[i].hienThi();
						svNCKH.baoCaoNCKH();
						coSV = true;
					}
				}
			}
			if (!coSV) {
				System.out.println("Khong co sv nao dat giai thuong NCKH");
			}
		}

}
