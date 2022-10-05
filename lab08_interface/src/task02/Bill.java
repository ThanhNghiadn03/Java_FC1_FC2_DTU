package task02;

import java.util.Scanner;

public class Bill {
	private int cusCode;
	private String cusType;
	private int oldIndex;
	private int newIndex;
	
	public int getCusCode() {
		return cusCode;
	}
	public String getCusType() {
		return cusType;
	}
	public int getNewIndex() {
		return newIndex;
	}
	public int getOldIndex() {
		return oldIndex;
	}
	public void setCusCode(int cusCode) {
		this.cusCode = cusCode;
	}
	public void setCusType(String cusType) {
		this.cusType = cusType;
	}
	public void setNewIndex(int newIndex) {
		this.newIndex = newIndex;
	}
	public void setOldIndex(int oldIndex) {
		this.oldIndex = oldIndex;
	}
	public Bill() {
		// TODO Auto-generated constructor stub
	}
	public Bill(int cusCode , String cusType , int oldIndex , int newIndex) {
		// TODO Auto-generated constructor stub
		this.cusCode = cusCode;
		this.cusType = cusType;
		this.oldIndex = oldIndex;
		this.newIndex = newIndex;
	}
	public void input() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap vao customer code : ");
		this.cusCode = Integer.parseInt(scn.nextLine());
		System.out.print("Nhap vao customer type : ");
		this.cusType = scn.nextLine();
		System.out.print("Nhap vao old index : ");
		this.oldIndex = Integer.parseInt(scn.nextLine());
		System.out.print("Nhap vao new index : ");
		this.newIndex = Integer.parseInt(scn.nextLine());
	}
	public void output() {
		System.out.println("\nCustomer code : "+this.cusCode);
		System.out.println("Customer type : "+this.cusType);
		System.out.println("Old index : "+this.oldIndex);
		System.out.println("New index : "+this.newIndex);
		System.out.println("Price : "+this.price());
		System.out.println("Payment : "+this.payment());
	}
	public int price() {
		if (this.cusType.equalsIgnoreCase("Resident")) {
			return 500;
		} else if(this.cusType.equalsIgnoreCase("Business") == true || this.cusType.equalsIgnoreCase("Organization") == true) {
			return 400;
		} else {
			return 300;
		}
	}
	public int payment() {
		int payment = this.price()*(this.getNewIndex() - this.getOldIndex());
		return payment;
	}
}
