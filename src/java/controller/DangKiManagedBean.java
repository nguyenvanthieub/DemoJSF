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

/**
 *
 * @author thieumao
 */
@Named(value = "dangKiManagedBean")
@SessionScoped
public class DangKiManagedBean implements Serializable {

    private TaiKhoan tk = new TaiKhoan();

    public TaiKhoan getTk() {
        return tk;
    }

    public void setTk(TaiKhoan tk) {
        this.tk = tk;
    }
    
    /**
     * Creates a new instance of DangKiManagedBean
     */
    public DangKiManagedBean() {
    }
    
    public String dangki() {
        return "thongtintaikhoan";
    }
    
}
