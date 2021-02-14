import java.net.*;
import java.io.*;

public class Serverrpc 
{
	public static void main(String[] args) throws Exception 
	 { 
	  ServerSocket sersock = new ServerSocket(5454); 
	  System.out.println("Server ready"); 
	  Socket sock = sersock.accept( ); 
	  BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in)); 
	  OutputStream ostream = sock.getOutputStream(); 
	  PrintWriter pwrite = new PrintWriter(ostream, true);  
	  InputStream istream = sock.getInputStream(); 
	  BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));   
	  String receiveMessage, sendMessage,fun;
	  int a,b,c;
	  
	   a = Integer.parseInt(receiveRead.readLine());
	   System.out.println("Parameter 1 : "+a);
	   b = Integer.parseInt(receiveRead.readLine());
	   System.out.println("Parameter 2 : "+b);
	   
	    c=a+b;
	    System.out.println("Addition = "+c);
	    pwrite.println("Addition = "+c); 
	   System.out.flush();
	  } 
}	