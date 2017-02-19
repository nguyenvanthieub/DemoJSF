/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author thieumao
 */
@Named(value = "helloManagedBean")
@Dependent
public class HelloManagedBean {

    private String a = "Gia tri ";

    public String getA() {
        this.setA("Gia tri moi nua");
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    
    public HelloManagedBean() {
    }
    
    public String ketqua() {
        this.setA("Gia tri moi");
        return "ketqua";
    }
    
}
