package com.project.Problem;

import java.util.*;
import java.util.regex.*;    

public class EmailValidation {

	public static void main(String[] args) {
		
        ArrayList<String> emails = new ArrayList<String>();  
        emails.add("yourname@domain.com");  
        emails.add("my.domain@domain.co.in");  
        emails.add("abolicholachgudd1223@gmail.com");
        emails.add("akshay123prepare@co.edu.com");
        emails.add("java.concepts@domain.co.in");
        
         
        String regex = "^(.+)@(.+)com"; 
       String regex1 = "//d[10]";
       
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regex1);
         
        for(String email : emails){  
            
            Matcher matcher = pattern.matcher(email);  
           
            System.out.println("Email Id : " + email +" is valid = "+ matcher.matches()+"\n" );  
        } 
    }  
}