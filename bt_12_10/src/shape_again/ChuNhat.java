package shape_again;

import java.util.Scanner;

public class ChuNhat extends Hinh{
	private String id;
	private double width;
	private double height;
	public ChuNhat() {
		// TODO Auto-generated constructor stub
	}
	public ChuNhat(String id , double width , double height) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.height = height;
		this.width = width;
	}
	public double getWidth() {
		return width;
	}
	public String getId() {
		return id;
	}
	public double getHeight() {
		return height;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		double area = this.height*this.width;
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		double peri = 2*(this.height+this.width);
		return peri;
	}

	@Override
	public void nhap() {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap id hinh chu nhat : ");
		this.id = scn.nextLine();
		System.out.print("Nhap vao height : ");
		this.height = Double.parseDouble(scn.nextLine());
		System.out.print("Nhap vao width : ");
		this.width = Double.parseDouble(scn.nextLine());
		
	}

	@Override
	public void in() {
		// TODO Auto-generated method stub
		System.out.println("ID : "+this.id);
		System.out.println("Height : "+this.height);
		System.out.println("Width : "+this.width);
		System.out.println("Dien tich : "+this.getArea());
		System.out.println("Chu vi : "+this.getPerimeter());
	}

}
