package encode_decode_basic;

import java.util.Arrays;
import java.util.Base64;



//It uses the Base64 alphabet specified by Java in RFC 4648 and RFC 2045 for encoding and decoding operations. 
//The encoder does not add any line separator character. 
//The decoder rejects data that contains characters outside the base64 alphabet.
public class Encode_decode_basic {
	 public static void main(String[] args) {  
	        // Getting encoder  
	        Base64.Encoder encoder = Base64.getEncoder();  
	        // Creating byte array  
	        byte byteArr[] = {1,2};  
	        // encoding byte array  
	        byte byteArr2[] = encoder.encode(byteArr);  
	        System.out.println("Encoded byte array: "+byteArr2);  
	        
	        Base64.Decoder byteArr2Decoder = Base64.getDecoder();
	        byte[] bDec = byteArr2Decoder.decode(byteArr2);
	        
	        System.out.println("Decode byte Array: "+Arrays.toString(bDec));
	        
	        byte[] byteArr3 = new byte[4];                // Make sure it has enough size to store copied bytes  
	        int x = encoder.encode(byteArr,byteArr3);    // Returns number of bytes written  
	        System.out.println("Encoded byte array written to another array: "+byteArr3);  
	        System.out.println("Number of bytes written: "+x);  
	        
	        Base64.Decoder byteArr3Decoder = Base64.getDecoder();
	        byte[] bDecArray3 = byteArr3Decoder.decode(byteArr3);
	        
	        System.out.println("Doing encode by new Array then Decode byte Array: "+Arrays.toString(bDecArray3));
	        
	 }	      
}
