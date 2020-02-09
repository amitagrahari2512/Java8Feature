package with_optional;

import java.util.Optional;

public class If_Value_Present {
	public static void main(String[] args) {  
        String[] str = new String[10];        
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";// Setting value for 5th index  
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        
        //It returns a non-empty string representation of this Optional suitable for debugging. 
        //The exact presentation format is unspecified and may vary between implementations and versions.
        System.out.println("checkNull.toString() then show : : "+checkNull.toString());
       
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
