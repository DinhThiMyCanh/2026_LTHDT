package Client;

import java.util.Date;
import java.util.Scanner;

import Enties.BacSi;
import Enties.DonThuoc;
import Enties.NhanVienYTe;
import Enties.Thuoc;
import Enties.YTa;
import Management.QLNhanVienYTe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		NhanVienYTe nv1 = new BacSi("01","Nguyen Tran Van Anh","Nam", new Date(107,0,12 ) ,2000000f,"Noi khoa");
		
		NhanVienYTe nv2 = new YTa("02","Nguyen Van B","Nam", new Date(107,9,21),2000000f,"truc cap cuu");
		
		NhanVienYTe nv3 = new BacSi("03","Le Tran Van","Nam", new Date(107,0,12 ) ,2000000f,"Noi khoa");
		
		QLNhanVienYTe list = new QLNhanVienYTe(5);
		list.themNV(nv1);
		list.themNV(nv2);
		list.themNV(nv3);
		
		list.lietKe();
		//Liệt kê danh sách Bác sĩ
		list.lietKe("BS");
		System.out.println("-------------");
		//Liệt kê danh sách Y Tá
		list.lietKe("Y");
	}

}
