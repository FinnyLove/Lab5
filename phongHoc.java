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
public class phongHoc {
    private String maPhong;
    private int dayNha;
    private double dienTich;
    private int soBongDen;
    public phongHoc(){
        super();
    }
    public phongHoc(String maPhong, int dayNha, double dienTich, int soBongDen) {
        this.maPhong = maPhong;
        this.dayNha = dayNha;
        this.dienTich = dienTich;
        this.soBongDen = soBongDen;
    }

    @Override
    public String toString() {
        return "phongHoc{" + "maPhong=" + maPhong + ", dayNha=" + dayNha + ", dienTich=" + dienTich + ", soBongDen=" + soBongDen + '}';
    }   

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public int getDayNha() {
        return dayNha;
    }

    public void setDayNha(int dayNha) {
        this.dayNha = dayNha;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoBongDen() {
        return soBongDen;
    }

    public void setSoBongDen(int soBongDen) {
        this.soBongDen = soBongDen;
    }
    public static phongHoc nhap(String maPhong) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Them day nha:");
        int dayNha = sc.nextInt();
        System.out.println("Them dien tich:");            
        double dienTich = sc.nextDouble();
        System.out.println("Them so bong den");
        int soBongDen = sc.nextInt();
        return new phongHoc( maPhong, dayNha, dienTich, soBongDen);       
    }
    public boolean datChuan(){
        return (this.dienTich / this.dayNha) >=10;                
    }
    
    
}
