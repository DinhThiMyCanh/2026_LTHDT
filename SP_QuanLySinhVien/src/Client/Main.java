package Client;

import Entities.*;
import Management.DSSV;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SV sv1 = new SVSP("Tran Thu Ha",2006,8.5f,"Truong QHQN",9.0f);
		SV sv2 = new SVTH("Tran Thu",2006,7.5f,"Nghien cuu Python",4.0f);
		SV sv3 = new SVSP("Pham Thi Nga",2006,6.0f,"Truong TV",8.0f);
		SV sv4 = new SVTH("Le Van Tu",2006,7.5f,"Nghien cuu Java",9.0f);
		
		DSSV list = new DSSV(50);
		list.themSV(sv1);
		list.themSV(sv2);
		list.themSV(sv3);
		list.themSV(sv4);
		list.lietKe();
		System.out.println("--------------------");
		list.lietKeTN();
		System.out.println("--------------------");
		list.lietKeKhenThuong();
		System.out.println("--------------------");
		list.lietKeNCKH();
		
			
	}

}
