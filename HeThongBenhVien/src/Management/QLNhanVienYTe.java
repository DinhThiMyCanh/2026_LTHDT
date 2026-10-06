package Management;

import java.util.Iterator;

import Entities.NhanVienYTe;

public class QLNhanVienYTe {
	private NhanVienYTe [] ds;
	private int soNV;
	
	public QLNhanVienYTe(int n) {
		ds = new NhanVienYTe[n];
		this.soNV =0;
	}
	
	//Thêm nhân viên
	public void themNV(NhanVienYTe nv) {
		if (this.soNV<ds.length) {
			ds[this.soNV]= nv;
			this.soNV++;
		}
	}
	//Liệt kê danh sách nhân viên
	public void lietKe() {
		//for(int i =0; i<this.soNV; i++)
		//	ds[i].hienThi();
		for (NhanVienYTe nv:ds)
			System.out.println(nv);
	}
	
	//Liệt kê danh sách theo loại nhân viên
		public void lietKe(String l) {
			for(int i =0; i<this.soNV; i++)
				if (ds[i].loaiNV().equals(l))
					ds[i].hienThi();
		}

}
