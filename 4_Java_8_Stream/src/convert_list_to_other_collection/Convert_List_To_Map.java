package convert_list_to_other_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import common.Product;

public class Convert_List_To_Map {
	 public static void main(String[] args) {  
	        List<Product> productsList = new ArrayList<Product>();  
	  
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	          
	        // Converting Product List into a Map  
	        Map<Integer,String> productPriceMap =   
	            productsList.stream()  
	                        .collect(Collectors.toMap(p->p.id, p->p.name));  
	              
	        System.out.println("Key as Id , and, value as name" + productPriceMap);  
	        
	        // Converting Product List into a Map  
	        Map<Integer,Float> productPriceMapNew =   
	            productsList.stream()  
	                        .collect(Collectors.toMap(p->p.id, p->p.price));  
	              
	        System.out.println("Key as Id , and, value as price" + productPriceMapNew);  
	        
	        
	    }  
}
