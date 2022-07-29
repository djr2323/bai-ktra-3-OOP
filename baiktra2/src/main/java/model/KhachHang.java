/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author Lenovo
 */
public class KhachHang implements Serializable{
    private int ma;
    private String ten, diachi, loai;
    private static int mast = 10000;

    public KhachHang() {
        ma = mast++;
    }

    public KhachHang(int ma, String ten, String dc, String loai) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = dc;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDc() {
        return diachi;
    }

    public void setDc(String dc) {
        this.diachi = dc;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public static int getMast() {
        return mast;
    }

    public static void setMast(int mast) {
        KhachHang.mast = mast;
    }
    
    public Object[] toObject() {
        return new Object[]{ma, ten, diachi, loai};
    }
}
