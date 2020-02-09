package reference_instance_method_predefined_functionalInterface;

public class PredefinedFunctionalInterfaceRunnable {
	public void ThreadStatus(){  
        System.out.println("Thread is running...");  
    }  
    public static void main(String[] args) { 
    	Runnable r =new PredefinedFunctionalInterfaceRunnable()::ThreadStatus;
        Thread t2=new Thread(r);  
        t2.start(); 
    }  
}
