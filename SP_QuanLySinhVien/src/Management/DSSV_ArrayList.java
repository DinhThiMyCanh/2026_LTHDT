package Management;


import java.io.*;
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
	
	//Ghi các sinh viên giỏi ra file?????
		public void ghiFile(String l, String tenFile) {
			System.out.println("Danh sach sv");
			for (SV a : ds) 
				if (a.loaiSV().equals(l)){
					//Ghi ra flie -DataOutputStream_WriteBytes
					
					
				}	
		}
	
	public void docFile(String tenFile) {
		try {
			FileInputStream f = new FileInputStream(tenFile);
			DataInputStream in = new DataInputStream(f);
			String s;
			while ((s=in.readLine())!=null) {
				String [] st = s.split("\\|");
				String ht = st[1];
				int ns =Integer.parseInt(st[2]);
				double dTB = Double.parseDouble(st[3]);
				
				String loai = st[0];
				SV sv;
				if (loai.equals("SVSP")) {
					String noiTT = st[4];
					double diemTT = Double.parseDouble(st[5]);
					sv = new SVSP(ht, ns, dTB, noiTT, diemTT);
					themSV(sv);
				}else {
					String tenDT = st[4];
					double diemDT = Double.parseDouble(st[5]);
					sv = new SVTH(ht, ns, dTB, tenDT, diemDT);
					themSV(sv);
				}
				
				
			}
			
			in.close();
			f.close();
		}catch (IOException e1) {
			System.out.println("Loi doc file");
		}catch (NumberFormatException e2) {
			System.out.println("Loi dinh dang so"+e2.toString());
		}
	}

}
