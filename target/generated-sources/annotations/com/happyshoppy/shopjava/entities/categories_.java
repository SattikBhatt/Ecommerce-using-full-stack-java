package com.happyshoppy.shopjava.entities;

import com.happyshoppy.shopjava.entities.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.12.v20230209-rNA", date="2024-01-11T13:46:27")
@StaticMetamodel(categories.class)
public class categories_ { 

    public static volatile SingularAttribute<categories, String> categoryTitle;
    public static volatile SingularAttribute<categories, Integer> categoryid;
    public static volatile ListAttribute<categories, Product> products;
    public static volatile SingularAttribute<categories, String> categoryDesc;

}