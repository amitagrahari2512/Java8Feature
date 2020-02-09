package common;

//We need to compile javac -parameters Calculate.java. 
//So it can store parameter name same as defined. like name and a

// but if we compile javac Calculate.java, so it will not store parameter name , and show value arg0 or arg1 etc,.
public class Calculate {
	
		public Calculate()
		{
			
		}
	
		public Calculate(String name , int a)
		{
			System.out.println(name + ":" + a);
		}
	    public int add(int a, int b){  
	        return (a+b);  
	    }  
	    
	    public int mul(int a, int b){  
	        return (b*a);  
	    }  
	    
	    
}
