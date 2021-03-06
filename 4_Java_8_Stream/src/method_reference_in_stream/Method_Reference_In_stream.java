package method_reference_in_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import common.Product;

public class Method_Reference_In_stream {

	public static void main(String[] args) {
		  List<Product> productsList = new ArrayList<Product>();  
          
	        //Adding Products  
	        productsList.add(new Product(1,"HP Laptop",25000f));  
	        productsList.add(new Product(2,"Dell Laptop",30000f));  
	        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
	        productsList.add(new Product(4,"Sony Laptop",28000f));  
	        productsList.add(new Product(5,"Apple Laptop",90000f));  
	          
	        List<Float> productPriceList =   
	                productsList.stream()  
	                            .filter(p -> p.price > 30000) // filtering data  
	                            .map(Product::getPrice)         // fetching price by referring getPrice method  
	                            .collect(Collectors.toList());  // collecting as list  
	        System.out.println("productPriceList : "+productPriceList);  
	        
	        List<String> productNameList =   
	                productsList.stream()  
	                            .filter(p -> p.price >= 30000) // filtering data  
	                            .map(Product::getName)         // fetching price by referring getName method  
	                            .collect(Collectors.toList());  // collecting as list  
	        System.out.println("productNameList : "+productNameList);  
	}

}
