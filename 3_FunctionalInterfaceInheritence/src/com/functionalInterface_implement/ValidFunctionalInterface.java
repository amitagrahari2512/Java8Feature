package com.functionalInterface_implement;

//a functional interface is extending to a non-functional interface.

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  

@FunctionalInterface  
interface SayableValid extends Doable{  
    void say(String msg);   // abstract method  
}  

public class ValidFunctionalInterface implements SayableValid{
	 public void say(String msg){  
	        System.out.println(msg);  
	    }  
	 
		public static void main(String[] args) {  
	    	ValidFunctionalInterface fie = new ValidFunctionalInterface();  
	        fie.say("ValidFunctionalInterface");  
	        
	        Doable d = new ValidFunctionalInterface();  
	        d.doIt();  
	        
	        SayableValid v = new ValidFunctionalInterface();  
	        v.doIt();  
	    }  
}
