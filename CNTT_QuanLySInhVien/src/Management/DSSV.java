package Management;

import Entities.IKhenThuong;
import Entities.INghienCuuKhoaHoc;
import Entities.SV;

public class DSSV {
	private SV[] ds;
	private int soSV;
	
	public DSSV (int n) {
		ds = new SV[n];
		soSV =0;
	}
	
	public void themSV(SV a) {
		if (soSV<ds.length) {
			ds[soSV] = a;
			soSV++;
		}
	}
	public void lietKe() {
		for (int i =0; i<soSV; i++) {
			//ds[i].hienThi();
			System.out.println(ds[i]);
		}
	}
	//Liệt kê danh sách sv theo loại sv
	public void lietKe(String l) {
		for (int i =0; i<soSV; i++) {
			if (ds[i].loaiSV().equals(l))
				ds[i].hienThi();
		}
	}
	
	//Liệt kê danh sách sv theo được TN
	public void lietKeDuocTN() {
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
					if (ds[i] instanceof INghienCuuKhoaHoc) {
						INghienCuuKhoaHoc svNCKH= (INghienCuuKhoaHoc) ds[i];
						if (svNCKH.datGiaiThuongNCKH()) {
							ds[i].hienThi();
							svNCKH.baoCaoDeTai();;
							coSV = true;
						}
					}
				}
				if (!coSV) {
					System.out.println("Khong co sv nao dat giai thuong NCKH");
				}
			}
}
	
