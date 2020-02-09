package java_type_inference;

public class GenericClassCalltest {
	 public static void main(String[] args) {  
	        GenericClass<String> genericClass = new GenericClass<String>();  
	        genericClass.setName("Peter");  
	        System.out.println(genericClass.getName());  
	          
	        GenericClass<Integer> genericClass2 = new GenericClass<>();  
	        genericClass2.setName(10);  
	        System.out.println(genericClass2.getName());  
	      
	        // New improved type inference  
	        System.out.println(genericClass2.genericMethod(new GenericClass<>()));  
	    }  
}
