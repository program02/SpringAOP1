/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.exam.throwsadvice;






/**
 *
 * @author Student
 */
public class A {

 public void validate(int age)throws Exception{  
        if(age<18){  
            throw new ArithmeticException("Not Valid Age");  
        }  
        else{  
            System.out.println("vote confirmed");  
        }  
    }  
}
