package com.amazon.test;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.amazon.pojo.HomePage;

public class AmazonTest1 {
	
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length()); 
       int i= A.compareTo(B);
        if(i>0){
        	 System.out.println("Yes");
        }else
        	 System.out.println("No");
        
        char [] a=A.toCharArray();
        char [] b=B.toCharArray();
        String temp= String.valueOf(a[0]);
        temp= temp.toUpperCase();
        a[0]=(temp.toCharArray())[0];
        
        temp= String.valueOf(b[0]);
        temp= temp.toUpperCase();
        b[0]=(temp.toCharArray())[0];
        
        System.out.println( String.valueOf(a) +" "+String.valueOf(b));
 
    }
}
