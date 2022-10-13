package task03;

import java.util.Scanner;

public class Student extends Person{
	private String degreeProgram;
	private int yearOfGraduation;
	public int getYearOfGraduation() {
		return yearOfGraduation;
	}
	public String getDegreeProgram() {
		return degreeProgram;
	}
	public void setYearOfGraduation(int yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}
	public void setDegreeProgram(String degreeProgram) {
		this.degreeProgram = degreeProgram;
	}
	public Student() {
		// TODO Auto-generated constructor stub
		super();
	}
	public Student(String code, String name, int rank , String program , int year) {
		// TODO Auto-generated constructor stub
		super(code, name, rank);
		this.degreeProgram = program;
		this.yearOfGraduation = year;
	}
	@Override
	public String description() {
		// TODO Auto-generated method stub
		switch(this.getRank()) {
			case 1:
				return "Freshman";
			case 2:
				return "Sophomore";
			case 3:
				return "Junior";
			case 4:
				return "Senior";
			case 5:
				return "Graduate";
			case 6:
				return "Masters Postgraduate";
			case 7:
				return "PhD Postgraduate";
			default :
				return "none";
		}
	}
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap vao degree program : ");
		this.degreeProgram = scn.nextLine();
		System.out.println("Nhap vao year of graduation : ");
		this.yearOfGraduation = Integer.parseInt(scn.nextLine());
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
		System.out.println("Degree program : "+this.getDegreeProgram());
		System.out.println("Year of graduation : "+this.getYearOfGraduation());
		System.out.println("Description : "+this.description());
	}
	
}
