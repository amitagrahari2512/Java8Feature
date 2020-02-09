package toArray;

import java.util.stream.Stream;

//toArray() method converts a stream into an array. 
public class ToArrayTest {
	public static void main(String[] args) {
        Object[] ob = Stream.of("A","B","C","D").toArray();
        for (Object o : ob) {
            System.out.println(o.toString());
        }
    }
}
