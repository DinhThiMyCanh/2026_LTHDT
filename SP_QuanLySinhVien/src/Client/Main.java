package Client;

import Entities.*;
import Management.DSSV;
import Management.DSSV_ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	SV sv1 = new SVSP("Tran Thu Ha",2006,8.5f,"Truong QHQN",9.0f);
		SV sv2 = new SVTH("Tran Thu",2006,7.5f,"Nghien cuu Python",4.0f);
		SV sv3 = new SVSP("Pham Thi Nga",2006,6.0f,"Truong TV",8.0f);
		SV sv4 = new SVTH("Le Van Tu",2006,7.5f,"Nghien cuu Java",9.0f);
		
		SV sv5 = new SVSP("Tran Thu Ha",2006,8.5f,"Truong QHQN",9.0f);
		
		DSSV_ArrayList list = new DSSV_ArrayList();
		list.themSV(sv1);
		list.themSV(sv2);
		list.themSV(sv3);
		list.themSV(sv4);
		list.themSV(sv5);*/
		
		DSSV_ArrayList list = new DSSV_ArrayList();
		list.docFile("DanhSachSinhVien.txt");
		
		list.lietKe();
		
		
		
	
		
		
			
	}

}
