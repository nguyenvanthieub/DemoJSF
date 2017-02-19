/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import model.*;
import java.util.*;

/**
 *
 * @author thieumao
 */
@Named(value = "sinhVienManagedBean")
@SessionScoped
public class SinhVienManagedBean implements Serializable {

    private SinhVien sv = new SinhVien();
    private List<SinhVien> dssv = new ArrayList<SinhVien>();

    public SinhVien getSv() {
        return sv;
    }

    public void setSv(SinhVien sv) {
        this.sv = sv;
    }

    public List<SinhVien> getDssv() {
        return dssv;
    }

    public void setDssv(List<SinhVien> dssv) {
        this.dssv = dssv;
    }

    /**
     * Creates a new instance of SinhVienManagedBean
     */
    public SinhVienManagedBean() {
    }
    
    public String thongtinsinhvien() {
        this.sv = new SinhVien("sv01", "Sinh Vien 1", "123 Truong Dinh");
        return "thongtinsinhvien";
    }
    
    public String danhsachsinhvien() {
        this.dssv.add(new SinhVien("sv01", "Sinh Vien 1", "123 Truong Dinh"));
        this.dssv.add(new SinhVien("sv02", "Sinh Vien 2", "246 Nguyen Trai"));
        this.dssv.add(new SinhVien("sv03", "Sinh Vien 3", "369 Nguyen Xuyen"));
        return "danhsachsinhvien";
    }
    
}
