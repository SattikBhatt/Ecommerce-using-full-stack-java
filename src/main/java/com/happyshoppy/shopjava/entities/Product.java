/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.happyshoppy.shopjava.entities;

import javax.persistence.*;
import javax.persistence.Entity;
import java.io.*;
/**
 *
 * @author bsatt
 */
@Entity
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private int Pid;
   private String Pname;
   @Column(length = 3000,name="Pdesc")
   private String Pdesc;
  
   private String productpic;
   private double Pprice;
   private int Pdiscount;
      private int quantity;

   @ManyToOne
   private categories category;
    public void setPid(int Pid) {
        this.Pid = Pid;
    }

    public void setPname(String Pname) {
        this.Pname = Pname;
    }

    public void setPdesc(String Pdesc) {
        this.Pdesc = Pdesc;
    }

    public void setProductpic(String productpic) {
        this.productpic = productpic;
    }

    public void setPprice(double Pprice) {
        this.Pprice = Pprice;
    }

    public void setPdiscount(int Pdiscount) {
        this.Pdiscount = Pdiscount;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPid() {
        return Pid;
    }

    public String getPname() {
        return Pname;
    }

    @Override
    public String toString() {
        return "Product{" + "Pid=" + Pid + ", Pname=" + Pname + ", Pdesc=" + Pdesc + ", productpic=" + productpic + ", Pprice=" + Pprice + ", Pdiscount=" + Pdiscount + ", quantity=" + quantity + '}';
    }

    public String getPdesc() {
        return Pdesc;
    }

    public String getProductpic() {
        return productpic;
    }

    public void setCategory(categories category) {
        this.category = category;
    }

    public categories getCategory() {
        return category;
    }

    public double getPprice() {
        return Pprice;
    }

    public int getPdiscount() {
        return Pdiscount;
    }

    public int getQuantity() {
        return quantity;
    }

//    public Product(String Pname, String Pdesc, String productpic, double Pprice, int Pdiscount, int quantity,categories c) {
//        this.Pname = Pname;
//        this.Pdesc = Pdesc;
//        this.productpic = productpic;
//        this.Pprice = Pprice;
//        this.Pdiscount = Pdiscount;
//        this.quantity = quantity;
//        this.category=c;
//    }
//   private int 
}
