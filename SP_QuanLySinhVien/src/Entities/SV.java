package Entities;

abstract public class SV{
	protected String hoTen;
	protected int namSinh;
	protected double dTB;
	
	public SV() {
		super();
	}

	public SV(String hoTen, int namSinh, double dTB) {
		super();
		this.hoTen = hoTen;
		this.namSinh = namSinh;
		this.dTB = dTB;
	}
	
	public void hienThi() {
		System.out.println(this.hoTen + " nam sinh:"+ this.namSinh+ " ĐTB:"+ this.dTB);
	}

	@Override
	public String toString() {
		return "SV [hoTen=" + hoTen + ", namSinh=" + namSinh + ", dTB=" + dTB + "]";
	}
	//Định  nghĩa lại phương thức equals
	public boolean equals(Object s)
	{
		if (s  instanceof  SV)
		{
			SV ss = (SV) s;
			return hoTen.equals(ss.hoTen) && namSinh==ss.namSinh && dTB==ss.dTB;
		}
		else return false;	
	}

	abstract public boolean duocTN();
	abstract public String loaiSV();
}
