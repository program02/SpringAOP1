/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.throwsadvice;



import org.springframework.aop.ThrowsAdvice;



/**
 *
 * @author Student
 */
public class ThrowsAdvisor implements ThrowsAdvice{  
    public void afterThrowing(Exception ex){  
        System.out.println("additional concern if exception occurs");  
    }  
}   
