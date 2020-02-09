package with_optional;

import java.util.Optional;

/*Java introduced a new class Optional in jdk8. 
It is a public final class and used to deal with NullPointerException in Java application. 
You must import java.util package to use this class. 
It provides methods which are used to check the presence of value for particular variable.*/
public class If_Value_Not_Present {
	public static void main(String[] args) {  
        String[] str = new String[10];  
        
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        
        //It returns a non-empty string representation of this Optional suitable for debugging. 
        //The exact presentation format is unspecified and may vary between implementations and versions.
        System.out.println("checkNull.toString() = null then show : : "+checkNull.toString());
       
        if(checkNull.isPresent()){  // check for value is present or not  
            String lowercaseString = str[5].toLowerCase();  
            System.out.println(lowercaseString);  
        }else  
            System.out.println("string value is not present");  
        
        //It returns the hash code value of the present value, if any, or returns 0 (zero) if no value is present.
        System.out.println("checkNull.hashCode() : : "+checkNull.hashCode());
        
        //If a value is present in this Optional, returns the value, otherwise throws NoSuchElementException.
        System.out.println("checkNull.get() : : "+checkNull.get());
    } 	
	
}
