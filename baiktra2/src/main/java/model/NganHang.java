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
public class NganHang implements Serializable{
    private int ma;
    private String ten;
    private double laisuat;
    private static int mast = 100;

    public NganHang() {
        ma = mast++;
    }

    public NganHang(int ma, String ten, double laisuat) {
        this.ma = ma;
        this.ten = ten;
        this.laisuat = laisuat;
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

    public double getLaisuat() {
        return laisuat;
    }

    public void setLaisuat(double laisuat) {
        this.laisuat = laisuat;
    }

    public static int getMast() {
        return mast;
    }

    public static void setMast(int mast) {
        NganHang.mast = mast;
    }
    
    
    
    
    public Object[] toObject() {
        return new Object[]{ma, ten, laisuat};
    }
    
}
