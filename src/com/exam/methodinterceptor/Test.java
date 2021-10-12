package com.exam.methodinterceptor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 *
 * @author Student
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext r = new ClassPathXmlApplicationContext("com/exam/methodinterceptor/applicationContext.xml");

        //Resource r = new ClassPathResource("com/exam/applicationContext.xml");
        //BeanFactory factory = new XmlBeanFactory(r);

        //A a = factory.getBean("proxy", A.class);
        A a = r.getBean("proxy", A.class);

        a.m();
    }
}
