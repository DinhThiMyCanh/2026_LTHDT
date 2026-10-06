package Client;

import java.util.Date;
import java.util.Scanner;

import Entities.*;
import Management.QLNhanVienYTe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienYTe nv1 = new BacSi("01", "Tran Thi Nhu Nguyet", "Nam", new Date(107,7,7), 3000000f, "Noi khoa");
		NhanVienYTe nv2 = new YTa("02","Nguyen van B","Nam",new Date(107,7,7),3000000f,"Cap cuu");
		NhanVienYTe nv3 = new BacSi("03", "Tran Thi Nhu", "Nu", new Date(105,4,7), 3000000f, "Noi khoa");
		
		Thuoc t = new Thuoc("Vitamin C");
		
		DonThuoc dt  = new DonThuoc();
		
		QLNhanVienYTe list = new QLNhanVienYTe(3);
		list.themNV(nv1);
		list.themNV(nv2);
		list.themNV(nv3);
		
		list.lietKe();
		
		//nv2.hienThi();
		//nv1.keDon(dt, t);
		System.out.println("--------------");
		//nv2.hienThi();
		//nv2.chamSocBenhNhan();
		
		
	}

}
