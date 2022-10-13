package quanlyhoadon;

import java.util.Scanner;

public class DSKhachHang {
	private static Scanner scn = new Scanner(System.in);
	private KhachHang[] listKH;
	private int numOfKH;
	public int getNumOfKH() {
		return numOfKH;
	}
	public void setNumOfKH(int numOfKH) {
		this.numOfKH = numOfKH;
	}
	public DSKhachHang() {
		// TODO Auto-generated constructor stub
		System.out.println("Nhap vao so luong : ");
		this.numOfKH = Integer.parseInt(DSKhachHang.scn.nextLine());
		listKH = new KhachHang[this.numOfKH];
	}
	public DSKhachHang(int num) {
		// TODO Auto-generated constructor stub
		this.numOfKH = num;
		listKH = new KhachHang[this.numOfKH];
		
	}
	public void inputList() {
		for(int i=0 ; i<this.numOfKH ; i++) {
			boolean isValid = true;
			do {
				System.out.println("\nBan muon nhap loai khach hang Viet Nam hay Nuoc Ngoai (V/N) ? ");
				String choice = DSKhachHang.scn.nextLine();
				if (choice.equalsIgnoreCase("V")) {
					listKH[i] = new KHVietNam();
					listKH[i].nhap();
					isValid = true;
				} else if (choice.equalsIgnoreCase("N")) {
					listKH[i] = new KHNuocNgoai();
					listKH[i].nhap();
					isValid = true;
				} else {
					System.out.println("\nChon khong hop le !!!");
					isValid = false;
				}
			} while(!isValid);
		}
	}
	public void outputList() {
		for(int i=0 ; i<this.numOfKH ; i++) {
			System.out.println("");
			listKH[i].in();
		}
	}
	public void foundByID() {
		System.out.println("Nhap ma KH can tim : ");
		String code = DSKhachHang.scn.nextLine();
		for(int i=0 ; i<this.numOfKH ; i++) {
			if(listKH[i].getMaKH().equalsIgnoreCase(code)) {
				listKH[i].in();
				return;
			}
		}
		System.out.println("Not Found !!!");
	}
	public void edit() {
		boolean isEdit = false;
		System.out.print("\nNhap vao ma khach hang de cap nhap lai ten khach hang : ");
		String code = DSKhachHang.scn.nextLine();
		for(int i=0 ; i<this.numOfKH ; i++) {
			if(listKH[i].getMaKH().equalsIgnoreCase(code)) {
				System.out.print("\nNhap ten ban muon cap nhat : ");
				String name = DSKhachHang.scn.nextLine();
				listKH[i].setHoTen(name);
				isEdit = true;
			}
		}
		if (isEdit) {
			System.out.println("\nDa cap nhat");
		} else {
			System.out.println("\nNot Found !!!");
		}
	}
	public void sortByPayment() {
		for(int i=0 ; i<this.numOfKH ; i++) {
			for(int j=i ; j<this.numOfKH ; j++) {
				if(listKH[i].tinhThanhTien() > listKH[j].tinhThanhTien()) {
					KhachHang tmp = listKH[i];
					listKH[i] = listKH[j];
					listKH[j] = tmp;
				}
			}
		}
	}
	public static void main(String[] args) {
		DSKhachHang lKH = new DSKhachHang();
		lKH.inputList();
		System.out.println("\n\nIN DANH SACH\n");
		lKH.outputList();
		System.out.println("\n\nTIM KIEM KHACH HANG\n");
		lKH.foundByID();
		System.out.println("\n\nCHINH SUA TEN KHACH HANG\n");
		lKH.edit();
		System.out.println("\n\nSAP XEP THEO THANH TOAN\n");
		lKH.sortByPayment();
		lKH.outputList();
	}
}
