package com.functionalInterface_implement;

@FunctionalInterface  
interface SayableObject{  
    void say(String msg);  
 // It can contain any number of Object class methods.  
    int hashCode();  
    String toString();  
    boolean equals(Object obj);  
}  


public class FunctionalInterfaceObjectMethod implements SayableObject{
	public void say(String msg){  
        System.out.println(msg);  
    }  
    public static void main(String[] args) {  
    	FunctionalInterfaceImplement fie = new FunctionalInterfaceImplement();  
        fie.say("Hello object class method use"); 
    }
    
}
