package interface_have_main_method_but_v_cant_call_default_methodInIt;

public interface Interface_have_main_method_but_v_cant_call_default_methodInIt {
	default void doIt(){  
        System.out.println("Do it now");  
    }  
    
    static void doIt(String a)
    {
    	System.out.println(a);
    }
    
    static void doIt(String a , String b)
    {
    	System.out.println(a +","+b);
    }
    
    public static void main(String[] args) {
    	doIt();
		doIt("Amit");
		doIt("Amit", "Abhi");
	}
}
