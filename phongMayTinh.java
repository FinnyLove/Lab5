/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;
import java.util.Scanner;
public class phongMayTinh extends phongHoc{
	private int maytinh;
	public phongMayTinh() {
		super();
	}
	public phongMayTinh (String maPhong, int dayNha, double dienTich, int soBongDen, int mayTinh) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.maytinh = maytinh;
	}
	public int getMaytinh() {
		return maytinh;
	}
	public void setMaytinh(int maytinh) {
		this.maytinh = maytinh;
	}
	
	@Override
	public String toString() {
		return "phong may tinh | maytinh = " + maytinh + " ";
	}
	public static phongMayTinh nhap(String maPhong) {
		Scanner sc = new Scanner(System.in);
		phongHoc phong = phongHoc.nhap(maPhong);
		System.out.println("Them so may tinh: ");
		int maytinh = sc.nextInt();
		return new phongMayTinh(maPhong, phong.getDaynha(), phong.getDientich(), phong.getSobongden(), maytinh);
	}
}