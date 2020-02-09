package execute_java_script_file_in_java_code;

import java.io.FileReader;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

/*Nashorn is a JavaScript engine. It is used to execute JavaScript code dynamically at JVM (Java Virtual Machine). 
Java provides a command-line tool jjs which is used to execute JavaScript code.
You can execute JavaScript code by using jjs command-line tool and by embedding into Java source code.*/

public class Execute_java_script_file_in_java_code {
	public static void main(String[] args) throws Exception{  
        // Creating script engine  
        ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");  
        // Reading Nashorn file  
        ee.eval(new FileReader("E:/Java Workspaces/Java8Feature/9_JavaScript_Nashorn/src/using_terminal/hello.js"));  
    }  
}
