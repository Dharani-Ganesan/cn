import java.io.*;
import java.net.*;

public class Clientrpc {
	public static void main(String[] args) throws Exception
	 {
	  Socket sock = new Socket("127.0.0.1", 5454); 
	  BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in)); 
	  OutputStream ostream = sock.getOutputStream(); 
	  PrintWriter pwrite = new PrintWriter(ostream, true); 
	  InputStream istream = sock.getInputStream(); 
	  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
	  System.out.println("Client ready, type and press Enter key");
	  String receiveMessage, sendMessage; 
	  
	   System.out.println("Addition Function : ");
	   System.out.println("Enter first parameter :");
	   sendMessage = keyRead.readLine(); 
	   pwrite.println(sendMessage);
	   System.out.println("Enter second parameter : ");
	   sendMessage = keyRead.readLine(); 
	   pwrite.println(sendMessage);
	   System.out.flush(); 
	   if((receiveMessage = receiveRead.readLine()) != null) 
	    System.out.println(receiveMessage); 
	  
	 }
}