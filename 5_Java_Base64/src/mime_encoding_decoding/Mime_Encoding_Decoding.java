package mime_encoding_decoding;

import java.util.Base64;


//It uses the Base64 alphabet as specified in RFC 2045 for encoding and decoding operations.
//The encoded output must be represented in lines of no more than 76 characters each and 
//uses a carriage return '\r' followed immediately by a linefeed '\n' as the line separator. 
//No line separator is added to the end of the encoded output.
//All line separators or other characters not found in the base64 alphabet table are ignored in decoding operation.
public class Mime_Encoding_Decoding {
	 public static void main(String[] args) {  
	        // Getting MIME encoder  
	        Base64.Encoder encoder = Base64.getMimeEncoder();  
	        String message = "Hello, \nYou are informed regarding your inconsistency of work\nTesting purpose";  
	        System.out.println("Message: " + message);
	        String eStr = encoder.encodeToString(message.getBytes());  
	        System.out.println("Encoded MIME message: "+eStr);  
	          
	        // Getting MIME decoder  
	        Base64.Decoder decoder = Base64.getMimeDecoder();  
	        // Decoding MIME encoded message  
	        String dStr = new String(decoder.decode(eStr));  
	        System.out.println("Decoded message: "+dStr);   
	        
	    }  
}
