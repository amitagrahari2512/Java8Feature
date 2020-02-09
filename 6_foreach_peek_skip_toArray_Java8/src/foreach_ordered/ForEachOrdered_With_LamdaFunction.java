package foreach_ordered;

import java.util.ArrayList;
import java.util.List;

public class ForEachOrdered_With_LamdaFunction {
	 public static void main(String[] args) {  
	        List<String> gamesList = new ArrayList<String>();  
	        gamesList.add("Football");  
	        gamesList.add("Cricket");  
	        gamesList.add("Chess");  
	        gamesList.add("Hocky");  
	        System.out.println("------------Iterating by passing lambda expression---------------");  
	        gamesList.stream().forEachOrdered(games -> System.out.println(games));  
	        
	    }  
	  
}
