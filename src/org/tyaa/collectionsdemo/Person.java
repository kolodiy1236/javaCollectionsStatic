/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.collectionsdemo;

/**
 *
 * @author student
 */
public class Person<T> {
    
    public String name;
    public int age;
    public T salary;
    
    private static int count;
    //step2: static var
    
    static{
    
        count = 0;
    }
    
    //step1: private
    public Person(){
        count++;
    }
    
    //step3: static method getInstance()
    
    public static int size(){
    
        return count;
    }
    
    public void setSalary(T _s){
        salary = _s;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        count--;
    }
}
