var hello = function(msg){  
    print("Hello ${msg}");  
};  
var message = <<EOF  
This is a java script file  
it contains multiple lines  
of code.  
let's execute.  
EOF 

hello(message);  

//While calling this code via terminal.
//We need to write command jjs -scripting hello.js and press enter.
//In Nashorn, heredocs are simply multi-line strings. 
//You can create it with << followed by a special termination marker, which is EOF. 
//You can also embed JavaScript expressions in ${...} expressions.