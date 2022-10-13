package shape_again;

import java.util.Scanner;

public class Circle extends Hinh{
	private String id;
	private double banKinh;
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	public Circle(String id , double banKinh) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.banKinh = banKinh;
	}
	
	public double getBanKinh() {
		return banKinh;
	}
	public String getId() {
		return id;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = Hinh.PI * this.banKinh * this.banKinh;
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double peri = 2*Hinh.PI*this.banKinh;
		return peri;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("\nNhap vao id cua hinh tron : ");
		this.id = scn.nextLine();
		System.out.print("Nhap vao ban kinh : ");
		this.banKinh = Double.parseDouble(scn.nextLine());
	}

	@Override
	public void in() {
		// TODO Auto-generated method stub
		System.out.println("ID hinh : "+this.id);
		System.out.println("Ban kinh : "+this.banKinh);
		System.out.println("Dien tich : "+this.getArea());
		System.out.println("Chu vi : "+this.getPerimeter());
	}
	
}
