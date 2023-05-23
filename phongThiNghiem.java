/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab5;

import java.util.Scanner;

/**
 *
 * @author phamq
 */
public class phongThiNghiem extends phongHoc{
    private String chuyenNganh;
    private int succhua;
    private boolean bonrua;
    public phongThiNghiem(){
        super();      
    }

    public phongThiNghiem(String chuyenNganh, int succhua, boolean bonrua) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.chuyenNganh = chuyenNganh;
        this.succhua = succhua;
        this.bonrua = bonrua;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public int getSucchua() {
        return succhua;
    }

    public void setSucchua(int succhua) {
        this.succhua = succhua;
    }

    public boolean isBonrua() {
        return bonrua;
    }

    public void setBonrua(boolean bonrua) {
        this.bonrua = bonrua;
    }

    @Override
    public String toString() {
        return "phongThiNghiem{" + "chuyenNganh=" + chuyenNganh + ", succhua=" + succhua + ", bonrua=" + bonrua + '}';
    }
    public static phongThiNghiem nhap(String maPhong) {
        Scanner sc = new Scanner(System.in);
        phongHoc phong = phongHoc.nhap(maPhong);
        System.out.println("Them chuyen nganh: ");
        String chuyenNganh = sc.nextLine();
        System.err.println("Them suc chua: ");
        int succhua = sc.nextInt();
        System.out.println("Co bon rua ");
        boolean bonrua = sc.nextBoolean();
        return new phongThiNghiem(maPhong, phong.getDayNha(), phong.getDienTich(), phong.getSoBongDen(),chuyenNganh, succhua, bonrua);
    }
}
