package task03;

import java.util.Scanner;

public abstract class Person {
	protected String code;
	protected String name;
	protected int rank;
	public Person() {}
	public Person (String code, String name, int rank){
	this.code = code;
	this.name = name;
	this.rank = rank;
	}
	public String getCode() {
	return code;
	}
	public String getName() {
		return name;
	}
	public int getRank() {
	return rank;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public abstract String description();
	public void input() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap vao employee code : ");
		this.code = scn.nextLine();
		System.out.print("Nhap vao ten : ");
		this.name = scn.nextLine();
		System.out.print("Nhap vao rank : ");
		this.rank = Integer.parseInt(scn.nextLine());
	}
	public void display() {
	System.out.println("Employee code:" + code);
	System.out.println("Employee name:" + name);
	System.out.println("Rank:" + rank);
	}
}
