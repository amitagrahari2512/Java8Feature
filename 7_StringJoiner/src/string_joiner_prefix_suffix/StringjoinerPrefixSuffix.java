package string_joiner_prefix_suffix;

import java.util.StringJoiner;

public class StringjoinerPrefixSuffix {
	  public static void main(String[] args) {  
		  
		  /*It constructs a StringJoiner with no characters in it using copies of the supplied prefix, 
		  delimiter and suffix. It throws NullPointerException if prefix, delimiter, or suffix is null.*/
		  
	        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
	          
	        // Adding values to StringJoiner  
	        joinNames.add("Rahul");  
	        joinNames.add("Raju");  
	        joinNames.add("Peter");  
	        joinNames.add("Raheem");  
	                  
	        System.out.println(joinNames);  
	    }  
}
