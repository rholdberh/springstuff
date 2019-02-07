package com.learningspring.dbimpl;


import com.learningspring.dbimpl.model.ProductDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbcstuff/beans.xml");
        ProductDAO productDAO = (ProductDAO) context.getBean("productdao");
        List list = productDAO.getProducts();
        System.out.println(list);

    }
}
