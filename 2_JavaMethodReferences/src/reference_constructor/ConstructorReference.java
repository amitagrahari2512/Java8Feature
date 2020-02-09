package reference_constructor;

public class ConstructorReference {
	public static void main(String[] args) {  
        Messageble hello = Message::new;  
        hello.getMessage("Hello");  
    }  
}
class Message{  
    Message(String msg){  
        System.out.print(msg);  
    }  
}  