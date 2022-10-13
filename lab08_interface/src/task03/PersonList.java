package task03;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import task02.Bill;

public class PersonList {
	private Person[] personList;
	private int numOfPeople;
	public PersonList() {
		// TODO Auto-generated constructor stub
		System.out.println("Nhap vao so luong nguoi : ");
		Scanner scn = new Scanner(System.in);
		this.numOfPeople = Integer.parseInt(scn.nextLine());
		personList = new Person[this.numOfPeople];
		for(int i=0 ; i<this.numOfPeople ; i++) {
			System.out.print("\nBan muon nhap Professor hay Student (P/S) ? ");
			String choice = scn.nextLine();
			if (choice.equalsIgnoreCase("P")) {
				System.out.println("");
				personList[i] = new Professor();
				personList[i].input();
			} else if(choice.equalsIgnoreCase("S")) {
				System.out.println("");
				personList[i] = new Student();
				personList[i].input();
			}
		}
	}
	public PersonList(int num) {
		// TODO Auto-generated constructor stub
		this.numOfPeople = num;
		personList = new Person[this.numOfPeople];
		for(int i=0 ; i<this.numOfPeople ; i++) {
			Scanner scn = new Scanner(System.in);
			System.out.print("\nBan muon nhap Professor hay Student (P/S) ? ");
			String choice = scn.nextLine();
			if (choice.equalsIgnoreCase("P")) {
				System.out.println("");
				personList[i] = new Professor();
				personList[i].input();
			} else if(choice.equalsIgnoreCase("S")) {
				System.out.println("");
				personList[i] = new Student();
				personList[i].input();
			}
		}
	}
	public void displayAll() {
		for(int i=0 ; i<this.numOfPeople ; i++) {
			System.out.println("");
			personList[i].display();
		}
	}
	public double avgRank() {
		double avg = 0.0;
		for(int i=0 ; i<this.numOfPeople ; i++) {
			avg += personList[i].getRank();
		}
		avg = avg/this.numOfPeople;
		return avg;
	}
	public void removeByCode(String code) {
		boolean wasDelete = false;
		for(int i=0 ; i<this.numOfPeople; i++) {
			if (personList[i].getCode().equalsIgnoreCase(code)) {
				for(int j = i ; j<this.numOfPeople; j++) {
					Person tmp = personList[i];
					personList[i] = personList[j];
					personList[j] = tmp;
				}
				System.out.println("Da xoa !!!");
				this.setNumOfPeople(this.numOfPeople-1);
				wasDelete = true;
				break;
			}
		}
		if (!wasDelete) {
			System.out.println("Not found !!!");
		}
		System.out.println("");
		this.displayAll();
	}
	public void maxRankLastFound() {
		Stack<Person> maxRank = new Stack<>();
		for(int i=0 ; i<this.numOfPeople ; i++) {
			if (personList[i] instanceof Professor && personList[i].getRank() == 6) {
				maxRank.push(personList[i]);
			} else if (personList[i] instanceof Student && personList[i].getRank() == 7) {
				maxRank.push(personList[i]);
			}
		}
		if (!maxRank.empty()) {
			maxRank.pop().display();
		}
	}
	public int getNumOfPeople() {
		return numOfPeople;
	}
	public void setNumOfPeople(int numOfPeople) {
		this.numOfPeople = numOfPeople;
	}
	public static void main(String[] args) {
		PersonList pl = new PersonList();
		pl.displayAll();
		System.out.println("\nAvg rank : "+pl.avgRank());
		System.out.print("\nEnter code to remove people : ");
		Scanner scn = new Scanner(System.in);
		String code = scn.nextLine();
		pl.removeByCode(code);
		System.out.println("\nLast-found max rank : ");
		pl.maxRankLastFound();
	}
}
