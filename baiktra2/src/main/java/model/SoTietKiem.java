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
public class SoTietKiem implements Serializable{
    private KhachHang k;
    private NganHang n;
    private double tiengui;
    private int sothang;
    private String ngaygui;

    public SoTietKiem() {
    }

    public SoTietKiem(KhachHang k, NganHang n, double tiengui, int sothang, String ngaygui) {
        this.k = k;
        this.n = n;
        this.tiengui = tiengui;
        this.sothang = sothang;
        this.ngaygui = ngaygui;
    }

    public KhachHang getK() {
        return k;
    }

    public void setK(KhachHang k) {
        this.k = k;
    }

    public NganHang getN() {
        return n;
    }

    public void setN(NganHang n) {
        this.n = n;
    }

    public double getTiengui() {
        return tiengui;
    }

    public void setTiengui(double tiengui) {
        this.tiengui = tiengui;
    }

    public int getSothang() {
        return sothang;
    }

    public void setSothang(int sothang) {
        this.sothang = sothang;
    }

    public String getNgaygui() {
        return ngaygui;
    }

    public void setNgaygui(String ngaygui) {
        this.ngaygui = ngaygui;
    }
    
    public Object[] toObject() {
        return new Object[]{k.getMa(), k.getTen(), n.getMa(), n.getTen(), tiengui, sothang, ngaygui};
    }
}
