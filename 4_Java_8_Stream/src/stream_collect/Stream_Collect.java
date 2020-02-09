package stream_collect;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import common.Product;

public class Stream_Collect {
	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // Using Collectors's method to sum the prices.  
        double withoutFilterCollect = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println("withoutFilterCollect : "+withoutFilterCollect);  
        
        double totalPriceFilterByPriceCollect = productsList.stream()
        		.filter(product->product.price>25000)
                .collect(Collectors.summingDouble(product->product.price));  
        System.out.println("totalPriceFilterByPriceCollect : "+totalPriceFilterByPriceCollect);  
        
        double totalPriceFilterByName = productsList.stream()
        		.filter(product->product.name.startsWith("HP") || product.name.startsWith("Dell") )
                .collect(Collectors.summingDouble(product->product.price));  
        System.out.println("totalPriceFilterByName : "+totalPriceFilterByName);  
          
    }  
}
