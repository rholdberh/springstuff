package com.learningspring.dbimpl;


import com.learningspring.dbimpl.model.Product;
import com.learningspring.dbimpl.model.ProductDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcstuff/beans.xml");
        ProductDAO productDAO = (ProductDAO) context.getBean("productdao");
        List list = productDAO.getProducts();
        Product prod = productDAO.getProductById(1);
        System.out.println(prod);

        Product prToCre = new Product();
        prToCre.setId(16);
        prToCre.setName("bla");
        productDAO.createProduct(prToCre);

    }
}
