package url_encoding_decoding;

import java.util.Base64;

//It uses the Base64 alphabet specified by Java in RFC 4648 for encoding and decoding operations.
//The encoder does not add any line separator character. 
//The decoder rejects data that contains characters outside the base64 alphabet.
public class Url_Encoding_Decoding {
	public static void main(String[] args) {  
        // Getting encoder  
        Base64.Encoder encoder = Base64.getUrlEncoder();  
        // Encoding URL  
        String eStr = encoder.encodeToString("http://www.javatpoint.com/java-tutorial/".getBytes());  
        System.out.println("Encoded URL: "+eStr);  
        // Getting decoder  
        Base64.Decoder decoder = Base64.getUrlDecoder();  
        // Decoding URl  
        String dStr = new String(decoder.decode(eStr));  
        System.out.println("Decoded URL: "+dStr); 
        
        System.out.println("Can we use simple string also with urlEncoder? Ans: Yes We can");
        
        String simple = encoder.encodeToString("Amit".getBytes());
        System.out.println("Encoded Simple String: "+simple);
        
        String simpleDecode = new String(decoder.decode(simple));
        System.out.println("Decode Simple String: "+simpleDecode);
        
    }  
}
