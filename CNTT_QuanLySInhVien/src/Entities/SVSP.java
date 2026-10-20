package Entities;

public class SVSP extends SV implements IKhenThuong {
	protected String noiTT;
	protected double diemTT;
	
	public SVSP(String hoTen, int namSinh, double dTB, String noiTT,double diemTT) {
		super(hoTen, namSinh, dTB);
		this.noiTT = noiTT;
		this.diemTT = diemTT;
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("Noi TT:"+noiTT);
		System.out.println("Diem TT:"+diemTT);
		
	}
	@Override
	public String toString() {
		return super.toString() + "SVSP [noiTT=" + noiTT + ", diemTT=" + diemTT + "]";
	}
	@Override
	public String loaiSV() {
		// TODO Auto-generated method stub
		return "SP";
	}
	@Override
	public boolean duocTN() {
		// TODO Auto-generated method stub
		return dTB>=5 && diemTT>=7.0;
	}
	@Override
	public boolean xetHocBong() {
		// TODO Auto-generated method stub
		return dTB>=MUC_DIEM_HOC_BONG;
	}
	@Override
	public void hienThiHocBong() {
		if (xetHocBong()) {
			System.out.println("SVSP:"+hoTen+ " duoc xet hoc bong");
		} else
			System.out.println("SVSP:"+hoTen+ " khong duoc xet hoc bong");
		
	}
	public boolean equals(Object s)
	{
		if (s  instanceof  SVSP)
		{
			SVSP ss = (SVSP) s;
			return hoTen.equals(ss.hoTen) && namSinh==ss.namSinh && dTB==ss.dTB && noiTT.equals(ss.noiTT) && diemTT == ss.diemTT;
		}
		else return false;	
	}

	
}
