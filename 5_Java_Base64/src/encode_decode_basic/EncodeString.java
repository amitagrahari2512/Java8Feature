package encode_decode_basic;

import java.util.Base64;


//It uses the Base64 alphabet specified by Java in RFC 4648 and RFC 2045 for encoding and decoding operations. 
//The encoder does not add any line separator character. 
//The decoder rejects data that contains characters outside the base64 alphabet.
public class EncodeString {

	public static void main(String[] args) {
		
		Base64.Encoder encoder = Base64.getEncoder();  
		// Encoding string  
        String str = encoder.encodeToString("AmitAgrahari".getBytes());  
        System.out.println("Encoded string: "+str);  
        
        // Getting decoder  
        Base64.Decoder decoder = Base64.getDecoder();  
        // Decoding string  
        String dStr = new String(decoder.decode(str));  
        System.out.println("Decoded string: "+dStr);  
        
        
        String s = encoder.encodeToString("Abhishek".getBytes());
        System.out.println("Encoded string: "+s);
        String dS = new String(decoder.decode(s));  
        System.out.println("Decoded string: "+dS);  
        
        System.out.println("Can we use line seperator in siple encoding type: yes, but its increase lenght of encode more then 76. BUt mime containds only 76 in one line.");
        String test = encoder.encodeToString("AmitAgrahari\nAbhishek\nAnuradha\nvinay\nsanjeev\nsatish\nneo\nAbhi".getBytes());  
        System.out.println("Encoded string: "+test);  
        String dTest = new String(decoder.decode(test));  
        System.out.println("Decoded string: "+dTest);  
        
        System.out.println("QW1pdEFncmFoYXJpCkFiaGlzaGVrCkFudXJhZGhhCnZpbmF5CnNhbmplZXYKc2F0aXNoCm5lbwpBYmhp==".length());
	}

}
