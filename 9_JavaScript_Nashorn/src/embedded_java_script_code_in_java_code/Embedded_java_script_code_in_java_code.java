package embedded_java_script_code_in_java_code;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Embedded_java_script_code_in_java_code {
	public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Evaluating Nashorn code  
        ee.eval("print('Hello Nashorn');");  
    }  
}
