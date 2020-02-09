package diff_forEach_forEachOrdered;

//forEach() method performs an action for each element of this stream. 
//For parallel stream, this operation does not guarantee to maintain order of the stream.
//In second example, output ("CwhnaasYanva th") is processed in parallel way that's 
//why it affect the order of stream.

//forEachOrdered() method performs an action for each element of this stream, 
//guaranteeing that each element is processed in encounter order for streams that have a defined encounter order.

public class Diff_ForEach_ForEachOrdered {
	public static void main(String[] args) {
        System.out.println("Using forEach()");
        String str = "Amit Agrahari";
        str.chars().forEach(n -> System.out.print((char) n));
 
        System.out.println("\n\nUsing parallel() + forEach()");
        str.chars().parallel().forEach(n -> System.out.print((char) n));
 
        System.out.println("\n\nUsing parallel() + forEachOrdered()");
        str.chars().parallel().forEachOrdered(n -> System.out.print((char) n));
    }
}
