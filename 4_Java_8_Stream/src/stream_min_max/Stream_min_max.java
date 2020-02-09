package stream_min_max;

import java.util.ArrayList;
import java.util.List;

import common.Product;

public class Stream_min_max {
	public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // max() method to get max Product price   
        Product productA = productsList.stream()  
                        .max((product1, product2)->   
                        product1.price > product2.price ? 1: -1).get();  
          
        System.out.println("Max value through max method :"+productA.price);  
        // min() method to get min Product price  
        Product productB = productsList.stream()  
                .max((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        System.out.println("Min value through max method :"+productB.price);  
        
        Product productC = productsList.stream()  
                .min((product1, product2)->   
                product1.price < product2.price ? 1: -1).get();  
        System.out.println("Max value through min method :"+productC.price);  
        
        Product productD = productsList.stream()  
                .min((product1, product2)->   
                product1.price > product2.price ? 1: -1).get();  
        System.out.println("Min value through min method :"+productD.price);  
          
    }  
}
