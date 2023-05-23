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
public class phongHocLyThuyet extends phongHoc{
    private boolean mayChieu;
    public phongHocLyThuyet(){
        super();  
    }
    public phongHocLyThuyet(String maPhong, int dayNha, double dienTich, int soBongDen,boolean mayChieu ) {
        super(maPhong, dayNha, dienTich, soBongDen);
        this.mayChieu = mayChieu;
    }
    public void setMayChieu(boolean mayChieu) {
        this.mayChieu = mayChieu;
    }
    @Override
    public String toString() {
        return "phong hoc ly thuyet | maychieu = " + mayChieu + " ";
    }
    public boolean datChuan(){
        return this.mayChieu && super.datChuan();
    }
    public static phongHocLyThuyet nhap(String maPhong){       
        Scanner sc = new Scanner(System.in  );
        phongHoc phong = phongHoc.nhap(maPhong);
        System.out.println("Co may chieu");
        boolean mayChieu = sc.nextBoolean();
        return new phongHocLyThuyet(maPhong, phong.getDayNha(), phong.getDienTich(), phong.getSoBongDen(), mayChieu);
	}
}
    

