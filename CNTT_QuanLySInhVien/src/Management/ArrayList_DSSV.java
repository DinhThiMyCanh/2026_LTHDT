package Management;

import java.util.ArrayList;

import Entities.SV;

public class ArrayList_DSSV {
	private ArrayList<SV> ds;
	
	public ArrayList_DSSV() {
		ds = new ArrayList<SV>();
	}
	
	public void themSV(SV a) {
		if (!ds.contains(a))
			ds.add(a);
	}
	public void lietKe() {
		for (SV a: ds) {
			System.out.println(a);
		}
	}
	//Liệt kê danh sách sv theo loại sv
	public void lietKe(String l) {
		for (SV a: ds) {
			if (a.loaiSV().equals(l))
				a.hienThi();
		}
	}
	
	//Liệt kê danh sách sv theo được TN
	public void lietKeDuocTN() {
		for (SV a: ds) {
			if (a.duocTN())
				a.hienThi();
		}
	}
}
