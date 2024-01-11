package com.happyshoppy.shopjava.entities;

import com.happyshoppy.shopjava.entities.categories;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-11T13:46:27")
@StaticMetamodel(Product.class)
public class Product_ { 

    public static volatile SingularAttribute<Product, String> Pname;
    public static volatile SingularAttribute<Product, Integer> quantity;
    public static volatile SingularAttribute<Product, String> productpic;
    public static volatile SingularAttribute<Product, String> Pdesc;
    public static volatile SingularAttribute<Product, Integer> Pid;
    public static volatile SingularAttribute<Product, Double> Pprice;
    public static volatile SingularAttribute<Product, Integer> Pdiscount;
    public static volatile SingularAttribute<Product, categories> category;

}