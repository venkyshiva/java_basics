import java.net.*;
import java.io.*;

public class ServerSample
{
   public static void main(String args[])
   {
      ServerSocket server = null;
      try 
      {
         server = new ServerSocket(5432);
      } 
      catch (IOException e) 
      {
         System.out.println("Error on port: 5432 " + ", " + e);
         System.exit(1);
      }

      System.out.println("Server setup and waiting for client connection ...");

      Socket client = null;
      try 
      {
         client = server.accept();
      } 
      catch (IOException e) 
      {
         System.out.println("Did not accept connection: " + e);
         System.exit(1);
      }

      System.out.println("Client connection accepted. Moving to local port ...");

      try
      {
         DataInputStream streamIn = new 
                  DataInputStream(new 
                  BufferedInputStream(client.getInputStream()));

         boolean done = false;
         String line;
         System.out.println("Waiting for client input...");
         while (!done)
         {
        	 System.out.println("Reading client input...");
            line = streamIn.readLine();
            if (line.equalsIgnoreCase(".bye"))
               done = true;
            else
               System.out.println("Client says: " + line);
         }
         
         System.out.println("Closing server...");
         streamIn.close();
         client.close();
         server.close();
      }
      catch(IOException e)
      { System.out.println("IO Error in streams " + e); }
   }
}
