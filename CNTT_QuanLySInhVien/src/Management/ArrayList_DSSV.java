package Management;

import java.util.ArrayList;
import java.io.*;

import Entities.SV;
import Entities.SVSP;
import Entities.SVTH;

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
	
	//Ghi ra file danh sách sv đạt loại giỏi
		public void ghiFile(String l) {
			for (SV a: ds) {
				if (a.loaiSV().equals(l)) {
					//Ghi ra file
					
				}
					
			}
		}
		
	//Đọc dữ liệu từ file để lấy thông tin sv
	public void docFile(String tenFile) {
		try {
			DataInputStream in = new DataInputStream(new FileInputStream(tenFile));
			String s;
			while ((s = in.readLine())!=null) {
				String [] st = s.split("\\|");
				String ht = st[1];
				int ns =Integer.parseInt(st[2]);
				double dTB = Double.parseDouble(st[3]);
				String loai = st[0];
				
				SV sv;
				if (loai.equals("SVSP")) {
					String noiTT = st[4];
					double diemTT = Double.parseDouble(st[5]);
					sv = new SVSP(ht,ns,dTB,noiTT,diemTT);
					themSV(sv);
				}else {
					String tenDT = st[4];
					double diemDT = Double.parseDouble(st[5]);
					sv = new SVTH(ht,ns,dTB,tenDT,diemDT);
					themSV(sv);
				}
			}
			
			in.close();
		}catch (IOException e) {
			System.out.println("Loi doc file");
		}
		
	}
	//ghi đối tượng sv ra file
	public void ghiFileObject(String tenFile) {
		
			try {
				FileOutputStream f = new FileOutputStream(tenFile);
				ObjectOutputStream out = new ObjectOutputStream(f);
				for (SV a : ds) {
				   out.writeObject(a);
				}
				out.close();
				f.close();
			}catch (IOException e) {
				System.out.println("Loi ghi file");
			}
	}
	//Đọc các đối tượng sv được TN từ file 
	public void docFileObject(String tenFile) throws IOException, ClassNotFoundException{
		FileInputStream f = new FileInputStream(tenFile);
		ObjectInputStream in = new ObjectInputStream(f);
		while (f.available()>0) {
			SV a = (SV)in.readObject();
			if (a.duocTN()) {
				a.hienThi();
			}
		}
		in.close();
		f.close();
	}
	
}
