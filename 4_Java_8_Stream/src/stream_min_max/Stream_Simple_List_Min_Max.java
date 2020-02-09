package stream_min_max;

import java.util.ArrayList;
import java.util.List;

public class Stream_Simple_List_Min_Max {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(3);
		l.add(10);
		l.add(100);
		
		int max = l.stream().max(
				(l1,l2)->l1>l2 ? 1 :-1).get();
		System.out.println("max: "+max);
		
		int min = l.stream().max(
				(l1,l2)->l1<l2 ? 1 :-1).get();
		System.out.println("min: "+min);
	}

}
