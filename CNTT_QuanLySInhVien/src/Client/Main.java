package Client;

import Entities.*;
import Management.DSSV;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SV sv1 = new SVSP("Le Thi Na",2002,8.5,"TRuong QH",8.0);
		SV sv2 = new SVTH("Nguyen A",2007,6.5,"Nghien cuu AI",6.0);
		SV sv3 = new SVSP("Tran B",2002,5.5,"TRuong TV",6.0);
		
		DSSV list = new DSSV(100);
		list.themSV(sv1);
		list.themSV(sv2);
		list.themSV(sv3);
		
		list.lietKeKhenThuong();
		
	}

}
