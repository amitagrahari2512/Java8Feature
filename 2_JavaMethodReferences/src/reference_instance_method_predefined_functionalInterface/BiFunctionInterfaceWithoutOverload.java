package reference_instance_method_predefined_functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionInterfaceWithoutOverload {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::add;
		int result = adder.apply(10, 20);
		System.out.println(result);
	}
}

class Arithmetic {
	public int add(int a, int b) {
		return a + b;
	}
}