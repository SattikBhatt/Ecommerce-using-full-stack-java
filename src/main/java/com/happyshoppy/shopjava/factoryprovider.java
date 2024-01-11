/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.happyshoppy.shopjava;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/**
 *
 * @author bsatt
 */
public class factoryprovider 
{
    private static SessionFactory fact=null;
  
    public static SessionFactory getFactory()
    {
        try
        {
//               System.out.print("HI BRO");
            if(fact==null)
            {
//             System.out.println("HI");
            fact=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
          
            }
        }
        catch(Exception e)
        {
                e.printStackTrace(); // Or use logger.error(e) for logging

        }
       
       return fact;
    }
}
