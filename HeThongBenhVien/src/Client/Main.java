package Client;

import java.util.Date;
import java.util.Scanner;

import Entities.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienYTe nv1 = new BacSi("01", "Nguyen Van A", "Nam", new Date(107,7,7), 3000000f, "Noi khoa");
		NhanVienYTe nv2 = new YTa("02","Nguyen van B","Nam",new Date(107,7,7),3000000f,"Cap cuu");
		
		Thuoc t = new Thuoc("Vitamin C");
		
		DonThuoc dt  = new DonThuoc();
		
		nv2.hienThi();
		nv1.keDon(dt, t);
		System.out.println("--------------");
		//nv2.hienThi();
		//nv2.chamSocBenhNhan();
		
		
	}

}
