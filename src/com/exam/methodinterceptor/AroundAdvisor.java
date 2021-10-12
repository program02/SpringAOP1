/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.methodinterceptor;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;



/**
 *
 * @author Student
 */
public class AroundAdvisor implements MethodInterceptor{  
  
    @Override  
    public Object invoke(MethodInvocation mi) throws Throwable {  
        Object obj;  
        System.out.println("additional concern before actual logic");  
        obj=mi.proceed();  
        System.out.println("additional concern after actual logic");  
        return obj;  
    }  
  
}  
