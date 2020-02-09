package setting_javascript_variable_in_java_file;

import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class Setting_JavaScript_variable_in_Java_File {
	public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        //Binding script and Define scope of script  
        Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);  
        bind.put("name", "Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("E:/Java Workspaces/Java8Feature/9_JavaScript_Nashorn/src/setting_javascript_variable_in_java_file/variable_hello.js"));  
    }  
}
