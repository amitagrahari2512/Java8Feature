package v_can_override_default;

import com.functionalInterface_implement.ValidFunctionalInterface;

interface Doable{  
    default void doIt(){  
        System.out.println("Do it now");  
    }  
}  

@FunctionalInterface  
interface SayableValid extends Doable{  
    void say(String msg);   // abstract method  
}  
public class OverrideDefaultMethod implements SayableValid{

	public void say(String msg){  
        System.out.println(msg);  
    }  
 
 
    @Override
	public void doIt() {
		// TODO Auto-generated method stub
    	SayableValid.super.doIt();
		System.out.println("default Override in inherit class");
	}


	public static void main(String[] args) {  
    	ValidFunctionalInterface fie = new ValidFunctionalInterface();  
        fie.say("ValidFunctionalInterface");  
        
        Doable d = new OverrideDefaultMethod();  
        d.doIt();  
        
        SayableValid v = new OverrideDefaultMethod();  
        v.doIt();  
    }  
}
