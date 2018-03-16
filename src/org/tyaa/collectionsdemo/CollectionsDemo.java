/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.tyaa.collectionsdemo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author student
 */
public class CollectionsDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List stringsList = new ArrayList();
        
        String s1 = "Hello";
        Integer i1 = 10;
        Integer i2 = 12;
        Person<Integer> p1 = new Person();
        Person<Double> p2 = new Person();
        
        stringsList.add(s1);//0
        stringsList.add(i1);//1
        stringsList.add(i2);//2
        stringsList.add(p1);//3
        
        int i = 0;
        /*for (Object object : stringsList) {
            
            if (object instanceof Integer) {
                
                //Integer tmp = (Integer)object;
                //tmp++;
                //stringsList.set(i, tmp);
                stringsList.remove(i);
            }
            i++;
        }*/
        
        //int size = stringsList.size();
        
        for (int j = 0; j < stringsList.size(); j++) {
            
            Object o = stringsList.get(j);
            if (o instanceof Integer) {
                
                //Integer tmp = (Integer)object;
                //tmp++;
                //stringsList.set(i, tmp);
                stringsList.remove(o);
                j--;
            }
        }
        
        for (Object object : stringsList) {
            
            System.out.println(object.toString());
        }
        
        //System.out.println(stringsList.get(1));
        
        
        /* 2 */
        
        List<Person> persons = new ArrayList<>();
        
       // p1.setSalary(22);
        //p2.setSalary(120d);
        //p2.setSalary((Double.valueOf("120")));
       // p2.setSalary((Double.valueOf(String.valueOf(120))));
        
        Person<Integer> p3 = new Person<>();
        
       //p3 = null;
        
        /*String result = "";
        for (int j = 0; j < 1000; j++) {
            result += j;
        }*/
        
        System.out.println(Person.size());
        //persons.add(s1);
        
        //Person p4 = Person.getInstance();
        //p4.age = 20;
        
        //Person p5 = Person.getInstance();
        //p5.age = 30;
        
        //System.out.println(p4.age);
        //System.out.println(p5.age);
        Person Ric = new Person();
    }
    
}
