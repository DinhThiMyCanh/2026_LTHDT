package Entities;

abstract public class SV {
	protected String hoTen;
	protected int namSinh;
	protected double dTB;
	
	public SV(String hoTen, int namSinh, double dTB) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.dTB = dTB;
	}
	public void hienThi() {
		System.out.println("Ho ten:"+hoTen);
		System.out.println("Nam sinh:"+namSinh);
		System.out.println("Diem TB:"+dTB);
	}
	
	@Override
	public String toString() {
		return "SV [hoTen=" + hoTen + ", namSinh=" + namSinh + ", dTB=" + dTB + "]";
	}
	
	//Phương thức xác định loại sv
	abstract public String loaiSV();
	
	//Phương thức xác định sv được tốt nghiệp
	abstract public boolean duocTN();
	
	
	
}
