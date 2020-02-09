package interface_static_method_can_not_use_by_implemted_class_name;


interface Doable{  
    default void doDefault(){  
        System.out.println("Do it now");  
    }  
    
    static void doStatic(String a)
    {
    	System.out.println(a);
    }
}  

public class Interface_static_method_can_not_use_by_implemted_class_name implements Doable{
	public static void main(String[] args) {
		Interface_static_method_can_not_use_by_implemted_class_name i = new Interface_static_method_can_not_use_by_implemted_class_name();
		i.doDefault();
		Doable.doStatic("Amit");
		i.doStatic("Amit");
	}


}
