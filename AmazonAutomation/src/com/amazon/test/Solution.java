package com.amazon.test;
import java.util.Scanner;

public class Solution {
	
	    public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        String B=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        System.out.println(A.length()+B.length()); 
	        if(A.length() > B.length()){
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
	        
	        System.out.println( a +" "+b);
     
	    }
	}



