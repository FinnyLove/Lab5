/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class nguoiQuanLy {
	Scanner sc = new Scanner(System.in);
	private List<phongHoc> dsphonghoc = new ArrayList<phongHoc>();
	private phongHoc timbangid(String maphong) {
		for (phongHoc ph : dsphonghoc) {
			if(ph.getMaPhong().equals(maphong)) {
				return ph;
			}
		}
		return null;
	}
	private List<phongHoc> theodaynha (){
		List<phongHoc> dsphong = this.dsphonghoc;
		dsphong.sort((o1, o2) -> o1.getDayNha() - o2.getDayNha());
		this.dsphonghoc = dsphong;
		return dsphong;
	}
	private List<phongHoc> theodientich (){
		List<phongHoc> dsphong = this.dsphonghoc;
		dsphong.sort((o1, o2) -> (int) (o1.getDienTich() - o2.getDienTich()));
		this.dsphonghoc = dsphong;
		return dsphong;
	}
	private List<phongHoc> theosobongden (){
		List<phongHoc> dsphong = this.dsphonghoc;
		dsphong.sort((o1, o2) -> o1.getSoBongDen() - o2.getSoBongDen());
		this.dsphonghoc = dsphong;
		return dsphong;
	}
	private void xuat(List<phongHoc> dsphong) {
		System.out.println(String.format("%20s %10s %15s %10s", "maphong", "daynha", "dientich", "sobongden"));
		for(phongHoc phong : dsphonghoc) {
			System.out.println(phong);
		}
	}
	private void kiemtradatchuan() {
		System.out.println("Danh sach phong dat chuan: ");
		System.out.println(String.format("%20s %10s %15s %10s", "maphong", "daynha", "dientich", "sobongden"));
		for(phongHoc phong : this.dsphonghoc) {
			if(phong.datChuan()) {
				System.out.println(phong);
			}
		}
	}
	private void updatesomaytinh(String maPhong, int maytinh) {
		phongMayTinh phong = (phongMayTinh)this.timbangid(maPhong);
		if(phong != null) {
			phong.setMayTinh(maytinh);
			for(int i = 0; i < dsphonghoc.size(); i++) {
				if(dsphonghoc.get(i).getMaPhong().equals(maPhong)) {
					dsphonghoc.remove(i);
					dsphonghoc.add(i, phong);
				}
			}
		}
	}
	private void them() {
		this.dsphonghoc.add(new phongMaytinh("1", 1, 100, 10, 2));
		this.dsphonghoc.add(new phongMaytinh("2", 2, 200, 20, 4));
		this.dsphonghoc.add(new phongMaytinh("3", 3, 300, 30, 6));
		this.dsphonghoc.add(new phongMaytinh("4", 4, 400, 40, 8));
		this.dsphonghoc.add(new phongThiNghiem("5", 1, 100, 10, "TECH1", 1, true));
		this.dsphonghoc.add(new phongThiNghiem("6", 2, 200, 20, "TECH2", 2, true));
		this.dsphonghoc.add(new phongThiNghiem("7", 3, 300, 30, "TECH3", 3, true));
		this.dsphonghoc.add(new phongThiNghiem("8", 4, 400, 40, "TECH4", 4, true));
		this.dsphonghoc.add(new phongHocLyThuyet("9", 1, 100, 10, true));
		this.dsphonghoc.add(new phonghocLyThuyet("10", 2, 200, 20, true));
		this.dsphonghoc.add(new phonghocLyThuyet("11", 3, 300, 30, true));
		this.dsphonghoc.add(new phonghocLyThuyet("12", 4, 400, 40, true));
	}
	private void menu() {
		System.out.println("----------------------------------");
		System.out.println("1. Them phong may tinh: ");
		System.out.println("2. Them phong thi nghiem: ");
		System.out.println("3. Them phong ly thuyet: ");
System.out.println("4. Chinh so may tinh trong phong: ");
		System.out.println("5. Xuat theo danh sach phong hoc: ");
		System.out.println("6. Sap xep theo dien tich: ");
		System.out.println("7. Sap xep theo bong den: ");
		System.out.println("8. Sap xep theo day nha: ");
		System.out.println("9. Xuat phong dat chuan: ");
		System.out.println("10. Thoat ");
		System.out.println("----------------------------------");
		int chon = sc.nextInt();
		menu(chon);
	}
	private void menu(int chon) {
		switch(chon) {
		case 1:
			this.dsphonghoc.add(phongMayTinh.nhap((dsphonghoc.size()+"")));
			break;
		case 2:
			this.dsphonghoc.add(phongThiNghiem.nhap((dsphonghoc.size()+"")));
			break;
		case 3:
			this.dsphonghoc.add(phongHocLyThuyet.nhap((dsphonghoc.size()+"")));
			break;
		case 4:
			String maphong = sc.nextLine();
			int maytinh = sc.nextInt();
			this.updatesomaytinh(maphong, maytinh);
			break;
		case 5:
			this.xuat(this.dsphonghoc);
			break;
		case 6:
			this.xuat(this.theodientich());
			break;
		case 7:
			this.xuat(this.theosobongden());
			break;
		case 8:
			this.xuat(this.theodaynha());
			break;
		case 9:
			this.kiemtradatchuan();
			break;
		case 10:
			System.exit(0);
			break;
		}
	}
	public void start() {
		this.them();
		while(true) {
			this.menu();
		}
	}
//	public static void timKiem(nguoiquanly ds) {
//		Scanner sc = new Scanner(System.in);
//		int maTim , pos;
//		System.out.println("Nhập mã phòng học : ");
//		maTim=sc.nextInt();
//		pos=ds.timbangid(maphong)
//	}
}