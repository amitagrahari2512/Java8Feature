package reference_instance_method_predefined_functionalInterface;

import java.util.function.BiFunction;

public class BiFunctionInterfaceWithOverload {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder1 = new ArithmeticOverload()::add;
		BiFunction<Integer, Float, Float> adder2 = new ArithmeticOverload()::add;
		BiFunction<Float, Float, Float> adder3 = new ArithmeticOverload()::add;
		int result1 = adder1.apply(10, 20);
		float result2 = adder2.apply(10, 20.0f);
		float result3 = adder3.apply(10.0f, 20.0f);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}

class ArithmeticOverload {
	public int add(int a, int b) {
		return a + b;
	}

	public float add(int a, float b) {
		return a + b;
	}

	public float add(float a, float b) {
		return a + b;
	}
}