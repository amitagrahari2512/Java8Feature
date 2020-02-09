package interface_with_static_and_default;

interface Doable{  
    default void doDefault(){  
        System.out.println("Do it now");  
    }  
    
    static void doStatic(String a)
    {
    	System.out.println(a);
    }
    
    
}  
public class InterfaceWithStaticAndDefault implements Doable{
	public static void main(String[] args) {
		InterfaceWithStaticAndDefault i = new InterfaceWithStaticAndDefault();
		i.doDefault();
		Doable.doStatic("Amit");
	}
}
