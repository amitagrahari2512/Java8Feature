package inside_interface_overload_method;

interface Doable{  
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
    
    
}  

public class InsideInterfaceOverload implements Doable{

	static void doIt(String a)
    {
    	System.out.println(a);
    }
	
	public static void main(String[] args) {
			InsideInterfaceOverload i = new InsideInterfaceOverload();
			i.doIt();//default method
			Doable.doIt("Amit");
			Doable.doIt("Amit","Abhi");
			
			InsideInterfaceOverload.doIt("Inside new method");// new method in class
			i.doIt("Inside new method");// new method in class
		}


}
