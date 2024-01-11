/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.happyshoppy.shopjava.entities;

import java.util.*;
import javax.persistence.*;
import java.io.*;

/**
 *
 * @author bsatt
 */
@Entity
public class categories implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int categoryid;
    @OneToMany(mappedBy = "category")
     private List<Product> products=new ArrayList<>();
    private String categoryTitle;
    private String categoryDesc;

//    public categories(int categoryid, String categoryTitle, String categoryDesc,List<Product> p) {
//        this.categoryid = categoryid;
//        this.categoryTitle = categoryTitle;
//        this.categoryDesc = categoryDesc;
//        this.products=p;
//    }

    @Override
    public String toString() {
        return "categories{" + "categoryid=" + categoryid + ", categoryTitle=" + categoryTitle + ", categoryDesc=" + categoryDesc + '}';
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public void setCategoryTitle(String categoryTitle) {
        this.categoryTitle = categoryTitle;
    }

    public void setCategoryDesc(String categoryDesc) {
        this.categoryDesc = categoryDesc;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public String getCategoryTitle() {
        return categoryTitle;
    }

    public String getCategoryDesc() {
        return categoryDesc;
    }
    
}
