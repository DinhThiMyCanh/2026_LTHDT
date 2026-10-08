package Entities;

public class SVSP extends SV implements IKhenThuong  {
	private String noiTT;
	private double diemTT;
	
	public SVSP() {
		super();
	}

	public SVSP(String hoTen, int namSinh, double dTB, String noiTT, double diemTT) {
		super(hoTen,namSinh,dTB);
		this.noiTT = noiTT;
		this.diemTT = diemTT;
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("Noi TT:"+this.noiTT +" diem TT:"+ this.diemTT);
	}

	@Override
	public String toString() {
		return super.toString() + " SVSP [noiTT=" + noiTT + ", diemTT=" + diemTT + "]";
	}

	@Override
	public boolean duocTN() {
		return dTB>=5 && diemTT>=7;
	}

	@Override
	public String loaiSV() {
		return "SP";
	}

	@Override
	public boolean xetHocBong() {
		return dTB>=MUC_DIEM_HOC_BONG && diemTT>=8.5f;
	}

	@Override
	public void hienThiHocBong() {
		if (xetHocBong()) {
			System.out.println("Sinh vien SP:"+hoTen +" dat hoc bong xuat sac");
		}else {
			System.out.println("Sinh vien SP:"+hoTen +" chua dat hoc bong");
		}
		
	}
}
