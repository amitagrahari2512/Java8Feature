package com.lam.parameter_type_no;

public class LambdaExpressionNoParameter {
	public static void main(String[] args) {  
	    Sayable s=()->{  
	        return "I have nothing to say.";  
	    };  
	    System.out.println(s.say());  
	}  
}
