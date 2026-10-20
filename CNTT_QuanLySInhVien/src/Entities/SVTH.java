package Entities;

public class SVTH extends SV implements IKhenThuong, INghienCuuKhoaHoc {
	protected String tenDT;
	protected double diemDT;
	
	public SVTH(String hoTen, int namSinh, double dTB, String tenDT, double diemDT) {
		super(hoTen, namSinh, dTB);
		this.tenDT = tenDT;
		this.diemDT = diemDT;
	}
	public void hienThi() {
		super.hienThi();
		System.out.println("ten de tai:"+tenDT);
		System.out.println("Diem de tai:"+diemDT);
	}
	@Override
	public String toString() {
		return super.toString()+ "SVTH [tenDT=" + tenDT + ", diemDT=" + diemDT + "]";
	}
	@Override
	public String loaiSV() {
		// TODO Auto-generated method stub
		return "TH";
	}
	@Override
	public boolean duocTN() {
		// TODO Auto-generated method stub
		return dTB>=5 && diemDT>=5.0;
	}
	@Override
	public boolean xetHocBong() {
		// TODO Auto-generated method stub
		return dTB>=MUC_DIEM_HOC_BONG && diemDT>=9.0;
	}
	@Override
	public void hienThiHocBong() {
		if (xetHocBong()) {
			System.out.println("SVTH:"+hoTen+ " duoc xet hoc bong");
		} else
			System.out.println("SVTH:"+hoTen+ " khong duoc xet hoc bong");
		
	}
	@Override
	public void baoCaoDeTai() {
		System.out.println("SV:"+hoTen+" bao cao de tai:"+ tenDT);
		
	}
	@Override
	public boolean datGiaiThuongNCKH() {
		// TODO Auto-generated method stub
		return diemDT>=8.0;
	}
	public boolean equals(Object s)
	{
		if (s  instanceof  SVTH)
		{
			SVTH ss = (SVTH) s;
			return hoTen.equals(ss.hoTen) && namSinh==ss.namSinh && dTB==ss.dTB && tenDT.equals(ss.tenDT) && diemDT == ss.diemDT;
		}
		else return false;	
	}

	
	
}
