package task03;

import java.util.Scanner;

public class Professor extends Person {
	private String department;
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Professor() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Professor(String code, String name, int rank , String department) {
		// TODO Auto-generated constructor stub
		super(code, name, rank);
		this.department = department;
	}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		switch(this.getRank()) {
			case 1 :
				return "Assistant Professor";
			case 2 :
				return "Associate Professor";
			case 3 :
				return "Professor";
			case 4 :
				return "Assistant Teaching Professor";
			case 5 :
				return "Associate Teaching Professor";
			case 6 : 
				return "Teaching Professor";
			default :
				return "None";
		}
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap vao department : ");
		this.department = scn.nextLine();
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Department : "+this.getDepartment());
		System.out.println("Description : "+this.description());
	}

}
