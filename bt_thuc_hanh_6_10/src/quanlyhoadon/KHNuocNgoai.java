package quanlyhoadon;

import java.util.Scanner;

public class KHNuocNgoai extends KhachHang{
	private String quocTich;
	public String getQuocTich() {
		return quocTich;
	}
	public void setQuocTich(String quocTich) {
		this.quocTich = quocTich;
	}
	public KHNuocNgoai() {
		// TODO Auto-generated constructor stub
		super();
	}
	public KHNuocNgoai(String maKH , String hoTen , String ngayHD , int soLuong , double donGia , String quocTich) {
		// TODO Auto-generated constructor stub
		super(maKH, hoTen, ngayHD, soLuong, donGia);
		this.quocTich = quocTich;
	}
	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		super.nhap();
		System.out.print("Nhap quoc tich : ");
		this.quocTich = scn.nextLine();
	}
	@Override
	public void in() {
		// TODO Auto-generated method stub
		super.in();
		System.out.println("Quoc tich : "+this.getQuocTich());
		System.out.println("Thanh tien : "+this.tinhThanhTien());
	}
	@Override
	public double tinhThanhTien() {
		// TODO Auto-generated method stub
		double thanhTien = this.getSoLuong()*this.getDonGia();
		return thanhTien;
	}

}
