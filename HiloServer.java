import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
import java.net.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 * Write a description of class Hilo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiloServer implements Runnable
{
    private final static int puerto = 5001;
    private String prsr;
    private String result;
    private ServerDato data = ServerDato.getInstance();
    public HiloServer(String prsr){
        this.prsr = prsr;
    }
    
    
    public void run()
        {  
        try {
            Socket clientSocket;
            ServerSocket serverSocket = new ServerSocket(puerto);
            while(true)
                {
                clientSocket = serverSocket.accept();
                BufferedReader input = new BufferedReader( new InputStreamReader( clientSocket.getInputStream() ) );
                PrintStream output = new PrintStream( clientSocket.getOutputStream() );
                String request = input.readLine().toString();
                String strOutput = prsr;
                if(request.equals("fire")){
                    this.process(request);
                }
                if(request.equals("left")){
                    this.process(request);
                }
                if(request.equals("right")){
                    this.process(request);
                }
                output.flush();
                output.println(strOutput);
                clientSocket.close();
                serverSocket.close();
                }
            }
        catch ( IOException ex )
            {
            
        }
    }
    
    public void process(String request)
            {
            if ( request.equals("fire"))
                {
                    result = request;
                    data.setDisparo(true);
                }
            if ( request.equals("left"))
                {
                    result = request;
                    data.setLeft(true);
                }
            if ( request.equals("right"))
                {
                    result = request;
                    data.setRight(true);
                }    
            }
    public String getFire(){
        return result;
    }        
}
