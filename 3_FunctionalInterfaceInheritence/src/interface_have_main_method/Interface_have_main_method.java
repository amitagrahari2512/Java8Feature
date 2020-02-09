package interface_have_main_method;

public interface Interface_have_main_method {
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
    	
		doIt("Amit");
		doIt("Amit", "Abhi");
	}
}
