package reference_static_method_predefined_functionalInterface;

public class PredefinedFunctionalInterfaceRunnable {
	public static void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) { 
    	Runnable r =PredefinedFunctionalInterfaceRunnable::ThreadStatus;
        Thread t2=new Thread(r);  
        t2.start(); 
    }  
}
