package filtering_collection_with_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import common.Product;

public class FilterCollection_With_Stream {
	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        List<Float> productPriceList2 =productsList.stream()  
                                     .filter(p -> p.price > 30000)// filtering data  
                                     .map(p->p.price)        // fetching price  
                                     .collect(Collectors.toList()); // collecting as list  
        System.out.println("Filter By Price: "+productPriceList2);  
        
        List<Product> filterProduct =productsList.stream()  
                .filter(p -> p.price > 30000)// filtering data  
                .collect(Collectors.toList()); // collecting as list  
        
        System.out.println("Filter By Product: ");  
        filterProduct.forEach(
        	(p) -> System.out.println(p.id + ":"+ p.name +":"+ p.price)
        );
        
    }  
}
