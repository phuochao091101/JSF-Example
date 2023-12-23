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
@Named(value = "surveyBean")
@RequestScoped
public class SurveyBean {

    /**
     * Creates a new instance of SurveyBean
     */
    private String wGender;
    private String wName;
    private String wPhone;
    
    public SurveyBean() {
    }
    
    public String goIndex(){
        return "index?face-redirect=true";
    }
    
    public String getResponse(){
        StringBuilder builder=new StringBuilder();
        builder.append("Print <br>");
        if(this.wName!=null){
            builder.append(String.format("Name %s <br>", this.wName));
            builder.append(String.format("Phone %s <br>", this.wPhone));
            builder.append(String.format("Gender %s <br>", this.wGender));
        }
        return builder.toString();
    }

    /**
     * @return the wGender
     */
    public String getwGender() {
        return wGender;
    }

    /**
     * @param wGender the wGender to set
     */
    public void setwGender(String wGender) {
        this.wGender = wGender;
    }

    /**
     * @return the wName
     */
    public String getwName() {
        return wName;
    }

    /**
     * @param wName the wName to set
     */
    public void setwName(String wName) {
        this.wName = wName;
    }

    /**
     * @return the wPhone
     */
    public String getwPhone() {
        return wPhone;
    }

    /**
     * @param wPhone the wPhone to set
     */
    public void setwPhone(String wPhone) {
        this.wPhone = wPhone;
    }
    
}
