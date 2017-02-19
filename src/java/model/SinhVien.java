/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author thieumao
 */
public class SinhVien {
    
    private String masv;
    private String hoten;
    private String diachi;

    public SinhVien() {
    }

    public SinhVien(String masv, String hoten, String diachi) {
        this.masv = masv;
        this.hoten = hoten;
        this.diachi = diachi;
    }

    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    
}
