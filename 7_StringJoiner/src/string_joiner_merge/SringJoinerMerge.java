package string_joiner_merge;

import java.util.StringJoiner;

public class SringJoinerMerge {

	public static void main(String[] args) {  
		
		StringJoiner join = new StringJoiner(","); 
		  
		System.out.println("If no value in string joiner then length:"+join.length());
		 
        StringJoiner joinNames = new StringJoiner(",", "[", "]");   // passing comma(,) and square-brackets as delimiter   
        
        System.out.println("If no value in string joiner then length if prefix add:"+joinNames.length());
        // Adding values to StringJoiner  
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
  
        // Creating StringJoiner with :(colon) delimiter  
        StringJoiner joinNames2 = new StringJoiner(":", "[", "]");  // passing colon(:) and square-brackets as delimiter   
          
        // Adding values to StringJoiner  
        joinNames2.add("Peter");  
        joinNames2.add("Raheem");  
  
        // Merging two StringJoiner 
        /*It adds the contents of the given StringJoiner without prefix and suffix as the next element if it is non-empty. 
        If the given StringJoiner is empty, the call has no effect.*/
        StringJoiner merge = joinNames.merge(joinNames2);   
        System.out.println(merge);  
        
        StringJoiner joinNames3 = new StringJoiner(":", "[", "]");
        StringJoiner mergeWithNoElement = joinNames.merge(joinNames3);   
        System.out.println("mergeWithNoElement: "+mergeWithNoElement);  
        
        
    }  
}
