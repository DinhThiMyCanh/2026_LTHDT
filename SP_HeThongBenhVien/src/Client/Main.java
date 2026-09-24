package Client;

import java.util.Scanner;

import Enties.BacSi;
import Enties.DonThuoc;
import Enties.NhanVienYTe;
import Enties.Thuoc;
import Enties.YTa;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	NhanVienYTe nv = new NhanVienYTe();
		Scanner sc = new Scanner(System.in);
		System.out.println("chon doi tuong");
		String chon = sc.nextLine();
		switch (chon) {
		case "BS": {
			 nv = new BacSi("01","Nguyen Van A","Nam", 1989,2000000f,"Noi khoa");
			break;
		}
		case "YTa": {
			 nv = new YTa("02","Nguyen Van B","Nam", 1980,2000000f,"truc cap cuu");;
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + chon);
		}
		*/
		
		NhanVienYTe nv1 = new BacSi("01","Nguyen Van A","Nam", 1989,2000000f,"Noi khoa");
		
		NhanVienYTe nv2 = new YTa("02","Nguyen Van B","Nam", 1980,2000000f,"truc cap cuu");
		
		Thuoc t = new Thuoc("Vitamin C");
		DonThuoc dt = new DonThuoc();
		
		nv1.hienThi();
		nv1.khamBenh();
		nv1.keDon(dt, t);
		
		//nv2.hienThi();
		//nv2.chamSocBenhNhan();
		
		//System.out.println(Math.PI);
		
	

	}

}
