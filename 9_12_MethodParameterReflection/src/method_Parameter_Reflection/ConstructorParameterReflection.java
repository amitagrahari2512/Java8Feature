package method_Parameter_Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Parameter;

import common.Calculate;

public class ConstructorParameterReflection {
	public static void main(String[] args) {  
        // Creating object of a class   
        Calculate calculate = new Calculate();  
        // instantiating Class class  
        Class cls = calculate.getClass();  
        // Getting declared constructor inside the Calculate class  
        Constructor[] constructor = cls.getDeclaredConstructors(); // It returns array of constructor  
        // Iterating constructor array  
        for (Constructor cons2 : constructor) {  
            System.out.print(cons2.getName());    // getting name of constructor  
            // Getting parameters of each method  
            Parameter parameter[] = cons2.getParameters(); // It returns array of parameters  
            // Iterating parameter array  
            for (Parameter parameter2 : parameter) {  
                System.out.print("\t"+parameter2.getParameterizedType()); // returns type of parameter  
                System.out.print("\t"+parameter2.getName()); // returns parameter name  
            }  
            System.out.println();  
        }  
    }  
}
