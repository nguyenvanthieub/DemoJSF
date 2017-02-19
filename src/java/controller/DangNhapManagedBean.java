/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author thieumao
 */
@Named(value = "dangNhapManagedBean")
@SessionScoped
public class DangNhapManagedBean implements Serializable {
    
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Creates a new instance of DangNhapManagedBean
     */
    public DangNhapManagedBean() {
    }
    
    public String dangnhap() {
        if (this.username.equals("a") && this.password.equals("b")) {
            return "welcome";
        }
        return "dangnhap";
    }
    
}
