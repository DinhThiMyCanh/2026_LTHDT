package Client;

import java.util.Scanner;

import Entities.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NhanVienYTe nv1 = new BacSi("01", "Nguyen Van A", "Nam",3000000f, "Noi khoa");
		NhanVienYTe nv2 = new YTa("02","Nguyen Thi B","Nu",3000000f,"Cap cuu");
		
		
		nv1.hienThi();
		nv1.khamBenh();
		System.out.println("--------------");
		nv2.hienThi();
		nv2.chamSocBenhNhan();
		
	}

}
