/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.happyshoppy.shopjava;

/**
 *
 * @author bsatt
 */
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySQLConnectionCheck {
    public static String check() {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        
        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();
            session.getTransaction().commit();
            return("Connected to MySQL successfully!");
        } catch (Exception e) {
            return("Connection failed: " + e.getMessage());
        } 
       
    }
}
