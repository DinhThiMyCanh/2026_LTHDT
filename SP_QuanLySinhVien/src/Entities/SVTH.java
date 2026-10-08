package Entities;

public class SVTH extends SV implements IKhenThuong, INghienCuuKHoaHoc{
	private String tenDT;
	private double diemDT;
	
	public SVTH() {
		super();
	}

	public SVTH(String hoTen, int namSinh, double dTB, String tenDT, double diemDT) {
		super(hoTen,namSinh,dTB);
		this.tenDT = tenDT;
		this.diemDT = diemDT;
	}
	
	public void hienThi() {
		super.hienThi();
		System.out.println("ten DT:"+this.tenDT +" diem DT:"+ this.diemDT);
	}

	@Override
	public String toString() {
		return super.toString() + " SVTH [tenDT=" + tenDT + ", diemDT=" + diemDT + "]";
	}
	
	public boolean duocTN() {
		return dTB>=5 && diemDT>=5;
	}
	@Override
	public boolean xetHocBong() {
		return dTB>=MUC_DIEM_HOC_BONG && diemDT>=8.0f;
	}

	@Override
	public String loaiSV() {
		return "TH";
	}

	@Override
	public void baoCaoNCKH() {
		System.out.println("SV:"+hoTen+" dang bao cao de tai NCKH:"+tenDT);
	}

	@Override
	public boolean datGiaiThuongNCKH() {
		return this.diemDT>=9.0f;
	}

	@Override
	public void hienThiHocBong() {
		if (xetHocBong()) {
			System.out.println("Sinh vien TH:"+hoTen +" dat hoc bong xuat sac");
		}else {
			System.out.println("Sinh vien TH:"+hoTen +" chua dat hoc bong");
		}
		
	}
}
