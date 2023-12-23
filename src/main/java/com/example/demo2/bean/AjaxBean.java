/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.example.demo2.bean;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author macbook
 */
@ManagedBean
@Named(value = "ajaxBean")
@RequestScoped
public class AjaxBean {

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    public String getMessage(){
        return "Welcome "+this.name;
    }
    
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    private String name;
    /**
     * Creates a new instance of AjaxBean
     */
    public AjaxBean() {
    }
    
}
