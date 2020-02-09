package reference_instance_method_functionalInterface;

public class FunctionalInterfaceMethodReference {
	
	 public void saySomething(){  
	        System.out.println("Hello, this is non static method.");  
	    }  
	    public static void main(String[] args) {  
	        // Referring static method  
	        Sayable sayable = new FunctionalInterfaceMethodReference()::saySomething;  
	        // Calling interface method  
	        sayable.say();  
	    }  

}
