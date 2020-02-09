package com.lam.parameter_type_one_mul;

public class LambdaExpressionMultipleParam {
	public static void main(String[] args) {  
		
	    MultipleParamAdd m=(a,b)->{  
	        return a+b;  
	    };  
	    System.out.println(m.add(1, 3));  
	    
	 // Multiple parameters with data type in lambda expression  
	    MultipleParamAdd m1 =(int a,int b)->(a+b);  
        System.out.println(m1.add(100,200));  
	}  
}
