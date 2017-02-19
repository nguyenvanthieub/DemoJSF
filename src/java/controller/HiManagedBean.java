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
@Named(value = "hiManagedBean")
@SessionScoped
public class HiManagedBean implements Serializable {
    
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * Creates a new instance of HiManagedBean
     */
    public HiManagedBean() {
    }
    
    public String sayHi() {
        this.setStatus("Gia tri moi cho Status");
        return "hi";
    }
    
}
