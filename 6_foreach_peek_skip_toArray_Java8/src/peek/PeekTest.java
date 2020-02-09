package peek;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//peek() is an intermediate operation. 
//It returns a new stream which consists all the elements of stream after applying the Consumer. 
public class PeekTest {
	 public static void main(String[] args) {
	        List<Integer> list = Arrays.asList(10,11,12);
	        list.stream().peek(i->System.out.println(i*i)).collect(Collectors.toList());
	    }    
}
