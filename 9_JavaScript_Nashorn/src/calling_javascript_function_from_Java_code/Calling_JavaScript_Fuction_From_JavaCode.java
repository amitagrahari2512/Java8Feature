package calling_javascript_function_from_Java_code;

import java.io.FileReader;

import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Calling_JavaScript_Fuction_From_JavaCode {
	public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("E:/Java Workspaces/Java8Feature/9_JavaScript_Nashorn/src/calling_javascript_function_from_Java_code/mul_function.js"));  
        Invocable invocable = (Invocable)ee;  
        // calling a function  
        invocable.invokeFunction("functionDemo1");  
        // calling a function and passing variable as well.  
        invocable.invokeFunction("functionDemo2","Nashorn");   
        
        invocable.invokeFunction("functionDemo3","Nashorn","Amit");  
    }  
}
