package com.simplilearn.firstspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
        
        Student s1=(Student) context.getBean("s");
        
        System.out.println("Id: "+s1.getId());
        System.out.println("Name: "+s1.getName());
        
        Student s2=(Student) context.getBean("s");
        
        System.out.println(s1==s2);// both are same instances
    }
}
