package java_type_inference;

public class GenericClass<X> {
	 	X name;  
	    public void setName(X name){  
	        this.name = name;  
	      }  
	    public X getName(){  
	        return name;  
	      }  
	    public X genericMethod(GenericClass<X> x){
	        return x.name;  
	      }  
}
