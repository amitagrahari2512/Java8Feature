package com.lamda.comparator_filter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaExpressionComparator {
	public static void main(String[] args) {  
        List<Product> list=new ArrayList<Product>();  
          
        //Adding Products  
        list.add(new Product(1,"HP Laptop",25000f));  
        list.add(new Product(3,"Keyboard",300f));  
        list.add(new Product(2,"Dell Mouse",150f));  
          
        System.out.println("Sorting on the basis of name...");  
  
        // implementing lambda expression  
        Collections.sort(list,(p1,p2)->{  
        return p1.name.compareTo(p2.name);  
        }
        ); 
        
        System.out.println("Simple for each");
        for(Product p:list){  
            System.out.println(p.id+" "+p.name+" "+p.price);  
        } 
        
        System.out.println("Through For Each Lamda");
        list.forEach(
        		(p)->System.out.println(p.id+" "+p.name+" "+p.price)
        );
  
    }  
}
