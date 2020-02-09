package com.functionalInterface_implement;

@FunctionalInterface  
interface Sayable{  
    void say(String msg);  
}  

public class FunctionalInterfaceImplement implements Sayable{
	 public void say(String msg){  
	        System.out.println(msg);  
	    }  
	    public static void main(String[] args) {  
	    	FunctionalInterfaceImplement fie = new FunctionalInterfaceImplement();  
	        fie.say("Hello there");  
	        
	        Sayable s = new FunctionalInterfaceImplement();
	        s.say("Polymorphism");
	        
	        Sayable p = (m)->{
	        	System.out.println(m);  
	        };
	        p.say("Lamda");
	    }  
}
