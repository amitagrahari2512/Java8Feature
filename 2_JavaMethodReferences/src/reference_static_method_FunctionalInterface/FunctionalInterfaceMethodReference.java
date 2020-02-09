package reference_static_method_FunctionalInterface;

public class FunctionalInterfaceMethodReference {
	
	 public static void saySomething(){  
	        System.out.println("Hello, this is static method.");  
	    }  
	    public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = FunctionalInterfaceMethodReference::saySomething;  
	        // Calling interface method  
	        sayable.say();  
	    }  

}
