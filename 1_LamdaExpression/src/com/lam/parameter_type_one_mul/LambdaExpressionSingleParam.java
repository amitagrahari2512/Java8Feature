package com.lam.parameter_type_one_mul;

public class LambdaExpressionSingleParam {
	public static void main(String[] args) {  
	    SingleParam s=(name)->{  
	        return "I have nothing to say." + name;  
	    };  
	    System.out.println(s.say("Amit"));  
	    
	    
	    //When lamda expression having one line expression then no need to use return.
	    //but if it have multiple lines we should have use return.
	    
	    //Single line
	    SingleParam s1=(String name)-> ("I have nothing to say." + name);   
	    System.out.println(s.say("Annu"));    
	    
	    // Multiple line
	    SingleParam s2=(name)->{  
	         String c =  "I have nothing to say." + name;  
	         String m = c + ". SO it is all over";
	         return m;
	    };  
	    System.out.println(s2.say("Abhi"));  
	    
	    
	}  
}
