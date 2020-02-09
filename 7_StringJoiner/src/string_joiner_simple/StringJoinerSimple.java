package string_joiner_simple;

import java.util.StringJoiner;

public class StringJoinerSimple {
	public static void main(String[] args) { 
		
		/*It constructs a StringJoiner with no characters in it, with no prefix or suffix, 
		and a copy of the supplied delimiter. 
		It throws NullPointerException if delimiter is null.*/
        StringJoiner joinNames = new StringJoiner(","); // passing comma(,) as delimiter   
          
        // Adding values to StringJoiner  
        /*It adds a copy of the given CharSequence value as the next element of the StringJoiner value. 
        If newElement is null,"null" is added.*/
        joinNames.add(null);
        joinNames.add("Rahul");  
        joinNames.add("Raju");  
        joinNames.add("Peter");  
        joinNames.add("Raheem");  
                  
        System.out.println(joinNames);  
    }  
}
