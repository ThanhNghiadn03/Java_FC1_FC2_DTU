package task02;

import java.util.Scanner;

public class BillList {
	private Bill[] listBill;
	private int numOfBill;
	public int getNumOfBill() {
		return numOfBill;
	}
	public Bill[] getListBill() {
		return listBill;
	}
	public void setNumOfBill(int numOfBill) {
		this.numOfBill = numOfBill;
	}
	public BillList() {
		// TODO Auto-generated constructor stub
		Scanner scn = new Scanner(System.in);
		System.out.println("Nhap vao so luong bill : ");
		int num = Integer.parseInt(scn.nextLine());
		this.numOfBill = num;
		listBill = new Bill[this.numOfBill];
		for (int i = 0; i < this.getNumOfBill(); i++) {
			listBill[i] = new Bill();
			System.out.println("\nNhap vao bill thu "+(i+1) +" : ");
			listBill[i].input();
		}
	}
	public BillList(int num) {
		// TODO Auto-generated constructor stub
		this.numOfBill = num;
		listBill = new Bill[this.numOfBill];
		for (int i = 0; i < this.getNumOfBill(); i++) {
			listBill[i] = new Bill();
			System.out.println("\nNhap vao bill thu "+(i+1) +" : ");
			listBill[i].input();
		}
	}
	public void outBillList() {
		for(int i=0 ; i<this.getNumOfBill() ; i++) {
			listBill[i].output();
		}
	}
	public void totalBill() {
		int type1=0 , type2=0 , type3=0 ;
		for(int i=0 ; i<listBill.length ; i++) {
			if (listBill[i].getCusType().equalsIgnoreCase("Resident")) {
				type1 += listBill[i].payment();
			} else if(listBill[i].getCusType().equalsIgnoreCase("Business") == true || listBill[i].getCusType().equalsIgnoreCase("Organization") == true) {
				type2 += listBill[i].payment();
			} else {
				type3 += listBill[i].payment();
			}
		}
		System.out.println("\nResident : "+type1);
		System.out.println("Business and Organization : " + type2);
		System.out.println("Other : "+type3);
	}
	public void removeByCusCode(int cusCode) {
		boolean wasDelete = false;
		for(int i=0 ; i<this.getNumOfBill(); i++) {
			if (listBill[i].getCusCode() == cusCode) {
				for(int j = i ; j<this.getNumOfBill()-1 ; j++) {
					Bill tmp = new Bill();
					tmp = listBill[j];
					listBill[j] = listBill[j+1];
					listBill[j+1] = tmp;
				}
				System.out.println("Da xoa !!!");
				this.setNumOfBill(this.numOfBill - 1);
				wasDelete = true;
				break;
			}
		}
		if (!wasDelete) {
			System.out.println("Not found !!!");
		}
		this.outBillList();
	}
	
	public Bill maxPayment() {
		Bill max = this.listBill[0];
		for(int i=0 ; i<this.getNumOfBill() ; i++) {
			if (max.payment() < listBill[i].payment()) {
				max = listBill[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		BillList bl = new BillList();
		bl.outBillList();
		System.out.println("\nTotal payment on customer type : ");
		bl.totalBill();
		System.out.print("\nRemove by customer code _ Enter customer code : ");
		Scanner scn = new Scanner(System.in);
		int cusCode = Integer.parseInt(scn.nextLine());
		bl.removeByCusCode(cusCode);
		System.out.println("\nMax payment : ");
		Bill maxBill = bl.maxPayment();
		maxBill.output();
	}
}
