import java.io.*;
import java.net.*;

class Main
{
    public static void main(String args[]) throws SocketException, UnknownHostException, IOException
    {    
      new EchoServer().start();
      EchoClient client = new EchoClient();

        String echo = client.sendEcho("hello server");
        
	

        echo = client.sendEcho("server is working");
        System.out.println( echo );
        
	client.sendEcho("end");
        client.close();
    }
}
