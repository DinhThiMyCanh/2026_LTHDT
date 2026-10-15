package Management;

import java.util.ArrayList;

import Entities.*;

public class DSSV_ArrayList {
	ArrayList<SV> ds;
	
	public DSSV_ArrayList() {
		ds = new ArrayList<SV>();
	}
	//Thêm nhân viên
	public void themSV(SV sv) {
		if (!ds.contains(sv)) {
			ds.add(sv);
		}
		
		
	}
	//Liệt kê danh sách sv
	public void lietKe() {
		for (SV a: ds) {
			a.hienThi();
		}
			
	}
	//Liệt kê danh sách nhân viên
	public void lietKe(String l) {
		System.out.println("Danh sach sv");
		for (SV a : ds) 
			if (a.loaiSV().equals(l)){
				a.hienThi();
			}	
	}

}
