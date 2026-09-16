package Client;

import Enties.BacSi;
import Enties.NhanVienYTe;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Tạo đối tượng bác sĩ thứ 1
		NhanVienYTe bs = new BacSi("01","Nguyen Van A","Nam", 1989,2000000f,"Noi khoa");
		
		
		//Tạo đối tượng bác sĩ thứ 2
		NhanVienYTe yta = new BacSi("02","Nguyen Van B","Nam", 1980,2000000f,"truc cap cuu");
		
		bs.hienThi();
		yta.hienThi();
		
	

	}

}
