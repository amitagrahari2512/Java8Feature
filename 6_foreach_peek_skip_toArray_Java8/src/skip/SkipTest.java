package skip;

import java.util.Arrays;
import java.util.List;


//skip() is a method that skips given number of element from the stream object from start. 
public class SkipTest {
	public static void main(String[] args) {
        List<String> list = Arrays.asList("AA","BB","CC","DD");
        list.stream().skip(2).forEach(s->System.out.println(s));
    }    
}
