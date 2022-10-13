package quanlyhoadon;

import java.util.Scanner;

public class KHVietNam extends KhachHang{
	private String doiTuongKH;
	private int dinhMuc;
	public String getDoiTuongKH() {
		return doiTuongKH;
	}
	public int getDinhMuc() {
		return dinhMuc;
	}
	public void setDoiTuongKH(String doiTuongKH) {
		this.doiTuongKH = doiTuongKH;
	}
	public void setDinhMuc(int dinhMuc) {
		this.dinhMuc = dinhMuc;
	}
	public KHVietNam() {
		// TODO Auto-generated constructor stub
		super();
	}
	public KHVietNam(String maKH , String hoTen , String ngayHD , int soLuong , double donGia , String doiTuong , int dinhMuc) {
		// TODO Auto-generated constructor stub
		super(maKH, hoTen, ngayHD, soLuong, donGia);
		switch(doiTuong) {
			case "Sinh hoat" :
			case "Kinh doanh" :
			case "San xuat" :
				this.doiTuongKH = doiTuong;
				break;
			default :
				this.doiTuongKH = "Sinh hoat";
				break;
		}
		this.dinhMuc = dinhMuc;
	}
	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		super.nhap();
		int choice;
		do {
			System.out.print("Chon 1 trong 3 loai doi tuong : 1.Sinh hoat , 2.Kinh doanh , 3.San xuat : ");
			choice = Integer.parseInt(scn.nextLine());
			switch(choice) {
				case 1 :
					this.doiTuongKH = "Sinh hoat";
					break;
				case 2 :
					this.doiTuongKH = "Kinh doanh";
					break;
				case 3 :
					this.doiTuongKH = "San xuat";
					break;
				default :
						System.out.println("\nNhap khong hop le !!!");
						break;
			}
		}while(choice < 1 || choice > 3);
		System.out.print("Nhap vao dinh muc : ");
		this.dinhMuc = Integer.parseInt(scn.nextLine());
	}
	@Override
	public void in() {
		// TODO Auto-generated method stub
		super.in();
		System.out.println("Doi tuong khach hang : "+this.getDoiTuongKH());
		System.out.println("Dinh muc : "+this.getDinhMuc());
		System.out.println("Thanh tien : "+this.tinhThanhTien());
	}
	@Override
	public double tinhThanhTien() {
		// TODO Auto-generated method stub
		double thanhTien = 0.0;
		if(this.getSoLuong() <= this.getDinhMuc()) {
			thanhTien = this.getSoLuong()*this.getDonGia();
		} else {
			thanhTien = this.getSoLuong()*this.getDonGia()*this.getDinhMuc()+(this.getSoLuong()-this.getDinhMuc())*this.getDonGia()*2.5;
		}
		return thanhTien;
	}

}
