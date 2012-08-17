import java.io.*;
import java.net.*;

public class ClientSample 
{
   public static void main(String[] args)
   {
      String host = "sciris.shu.edu";
      try 
      {
         Socket           client    = new Socket(InetAddress.getLocalHost(), 5432);
         DataOutputStream socketOut = new DataOutputStream(client.getOutputStream());
         DataInputStream  socketIn  = new DataInputStream(client.getInputStream());
         DataInputStream  console   = new DataInputStream(System.in);
         System.out.println("Connected to " + host + ". Enter text:");

         boolean done = false;
         String line;
         System.out.println("Client while started...");
         while (!done) 
         {
        	 System.out.println("Say something to server...");
            line = console.readLine();
            if (line.equalsIgnoreCase(".bye"))
               done = true;
            socketOut.writeBytes(line + '\n');
         }
         
         System.out.println("Close the socket...");

         socketOut.close(); socketIn.close(); client.close();
      } 
      catch (UnknownHostException e) 
      { System.err.println(host + ": unknown host."); } 
      catch (IOException e) 
      { System.err.println("I/O error with " + host); }
   }
}