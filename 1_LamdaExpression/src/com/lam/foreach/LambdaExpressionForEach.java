package com.lam.foreach;

import java.util.ArrayList;
import java.util.List;

public class LambdaExpressionForEach {
	 public static void main(String[] args) {  
         
	        List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	        System.out.println("Syso:"+list); 
	        
	        list.forEach(  
	            (n)->System.out.println(n)  
	        );  
	        
	        
	    }  
}

