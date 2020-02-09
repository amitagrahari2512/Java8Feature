package stream_iterating;

import java.util.stream.Stream;

public class Stream_Iterating {
	public static void main(String[] args){  
		
		System.out.println("start by 1,increase by 1, 5 element show");
        Stream.iterate(1, element->element+1)  
        .filter(element->element%5==0)  
        .limit(5)  
        .forEach(System.out::println);  
        
        System.out.println("start by 1,increase by 3, 7 element show");
        Stream.iterate(3, element->element+3)  
        .filter(element->element%5==0)  
        .limit(7)  
        .forEach(System.out::println);  
    }  
}
