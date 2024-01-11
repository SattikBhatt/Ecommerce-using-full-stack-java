/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.happyshoppy.shopjava.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.*;


/**
 *
 * @author bsatt
 */
@Entity

public class Userr implements Serializable{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
      @Column(length=10,name="userid")
     private int userid;
    @Column(length=100,name="username")
    private String username;
    @Column(length=100,name="useremail")
    private String useremail;
    @Column(length=100,name="userpassword")
    private String password;
    @Column(length=11,name="userphone")
    private String userphone;
    @Column(length=100,name="userpic")
    private String userpic;
    @Column(length=1500,name="useraddress")
    private String useraddress;

//    public Userr(String username, String useremail, String password, String userphone, String userpic, String useraddress)
//    {
//        this.username = username;
//        this.useremail = useremail;
//        this.password = password;
//        this.userphone = userphone;
//        this.userpic = userpic;
//        this.useraddress = useraddress;
//    }

    public int getUserid() {
        return userid;
    }

    public String getUsername() {
        return username;
    }

    public String getUseremail() {
        return useremail;
    }

    public String getPassword() {
        return password;
    }

    public String getUserphone() {
        return userphone;
    }

    public String getUserpic() {
        return userpic;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    @Override
    public String toString() {
        return "User{" + "userid=" + userid + ", username=" + username + ", useremail=" + useremail + ", password=" + password + ", userphone=" + userphone + ", userpic=" + userpic + ", useraddress=" + useraddress + '}';
    }
    
}
