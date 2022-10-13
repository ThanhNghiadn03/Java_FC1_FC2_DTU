package shape_again;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class listHinh {
//	private List<Hinh> dsHinh = new ArrayList<>();
//	public static Scanner scn = new Scanner(System.in);
//	public void nhapDS() {
//		boolean isContinue = true;
//		do {
//			System.out.print("\nBan muon nhap hinh Tron hay Chu Nhat (T/C) ? ");
//			String choose = scn.nextLine();
//			Hinh tmp;
//			if (choose.equalsIgnoreCase("T")) {
//				tmp = new Circle();
//				tmp.nhap();
//				dsHinh.add(tmp);
//			} else if (choose.equalsIgnoreCase("C")) {
//				tmp = new ChuNhat();
//				tmp.nhap();
//				dsHinh.add(tmp);
//			} else {
//				System.out.println("\nInvalid !!!");
//			}
//			System.out.println("\nBan co muon tiep tuc ? (Y/N)");
//			String chon = scn.nextLine();
//			if (!chon.equalsIgnoreCase("Y")) {
//				isContinue = false;
//			}
//		}while(isContinue);
//	}
//	public void in() {
//		for(Hinh hinh : dsHinh) {
//			System.out.println("\n");
//			hinh.in();
//		}
//	}
//	public void timTheoID() {
//		System.out.print("Nhap vao id muon tim : ");
//		String found = scn.nextLine();
//		for(Hinh hinh : dsHinh) {
//			if (hinh instanceof Circle && ((Circle) hinh).getId().equalsIgnoreCase(found)) {
//				hinh.in();
//			} else if(hinh instanceof ChuNhat && ((ChuNhat) hinh).getId().equalsIgnoreCase(found)) {
//				hinh.in();
//			}
//		}
//	}
//	public void xoaByID() {
//		System.out.print("Nhap vao id muon xoa : ");
//		String found = scn.nextLine();
//		for(Hinh hinh : dsHinh) {
//			if (hinh instanceof Circle && ((Circle) hinh).getId().equalsIgnoreCase(found)) {
//				dsHinh.remove(hinh);
//				System.out.println("\nDa xoa !!!");
//			} else if(hinh instanceof ChuNhat && ((ChuNhat) hinh).getId().equalsIgnoreCase(found)) {
//				dsHinh.remove(hinh);
//				System.out.println("\nDa xoa !!!");
//			}
//		}
//		System.out.println("\n\n");
//		this.in();
//	}
//	public static void main(String[] args) {
//		listHinh lh = new listHinh();
//		lh.nhapDS();
//		lh.in();
//		lh.timTheoID();
//		lh.xoaByID();
//	}
	public static Scanner scn = new Scanner(System.in);
	private List<Hinh> dsHinh = new ArrayList<>();
	public void nhapDS() {
		boolean isContinue = true;
		do {
			System.out.println("Ban muon nhap hinh Tron hay Chu Nhat ? (T/C) ");
			String choose = scn.nextLine();
			if (choose.equalsIgnoreCase("T")) {
				Hinh tmp = new Circle();
				tmp.nhap();
				dsHinh.add(tmp);
			} else if (choose.equalsIgnoreCase("C")) {
				Hinh tmp = new ChuNhat();
				tmp.nhap();
				dsHinh.add(tmp);
			}
			System.out.println("Ban muon tiep tuc hay khong ? (Y/N) ");
			choose = scn.nextLine();
			if (choose.equalsIgnoreCase("N")) {
				isContinue = false;
			}
		}while(isContinue);
	}
	
	public void inDS() {
		for(Hinh con : dsHinh) {
			System.out.println("\n");
			con.in();
		}
	}
	
	public void timKiemByID() {
		System.out.println("\nNhap vao ID can tim : ");
		String id = scn.nextLine();
		for(Hinh con : dsHinh) {
			if (con instanceof Circle && ((Circle) con).getId().equalsIgnoreCase(id)) {
				con.in();
			}
			if (con instanceof ChuNhat && ((ChuNhat) con).getId().equalsIgnoreCase(id)) {
				con.in();
			}
		}
	}
	
	public void xoa() {
		System.out.println("\nNhap vao ID can xoa : ");
		String id = scn.nextLine();
		for(Hinh con : dsHinh) {
			if (con instanceof Circle && ((Circle) con).getId().equalsIgnoreCase(id)) {
				dsHinh.remove(con);
			}
			if (con instanceof ChuNhat && ((ChuNhat) con).getId().equalsIgnoreCase(id)) {
				dsHinh.remove(con);
			}
		}
	}
	
	
	public static void main(String[] args) {
		listHinh lh = new listHinh();
		lh.nhapDS();
		lh.inDS();
		lh.timKiemByID();
		lh.xoa();
		System.out.println("\n");
		lh.inDS();
	}
}
