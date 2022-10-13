package quanlyhoadon;

import java.util.Scanner;

public abstract class KhachHang implements ITIENDIEN{
	private String maKH;
	private String hoTen;
	private String ngayHD;
	private int soLuong;
	private double donGia;
	public void nhap() {
		Scanner scn = new Scanner(System.in);
		System.out.print("\nNhap vao ma KH : ");
		this.maKH = scn.nextLine();
		System.out.print("Nhap vao ho ten KH : ");
		this.hoTen = scn.nextLine();
		System.out.print("Nhap vao ngay HD duoc tao : ");
		this.ngayHD = scn.nextLine();
		System.out.print("Nhap vao so luong : ");
		this.soLuong = Integer.parseInt(scn.nextLine());
		System.out.print("Nhap vao don gia : ");
		this.donGia = Double.parseDouble(scn.nextLine());
	}
	public void in() {
		System.out.println("\nMa KH : "+this.maKH);
		System.out.println("Ho va ten : "+this.hoTen);
		System.out.println("Ngay HD duoc tao : "+this.ngayHD);
		System.out.println("So luong : "+this.soLuong);
		System.out.println("Don gia : "+this.donGia);
	}
	public KhachHang() {
		// TODO Auto-generated constructor stub
	}
	public KhachHang(String maKH , String hoTen , String ngayHD , int soLuong , double donGia) {
		// TODO Auto-generated constructor stub
		this.maKH = maKH;
		this.hoTen = hoTen;
		this.ngayHD = ngayHD;
		this.soLuong = soLuong;
		this.donGia = donGia;
	}
	public double getDonGia() {
		return donGia;
	}
	public String getHoTen() {
		return hoTen;
	}
	public String getMaKH() {
		return maKH;
	}
	public String getNgayHD() {
		return ngayHD;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public void setNgayHD(String ngayHD) {
		this.ngayHD = ngayHD;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
}
