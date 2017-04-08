import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)



/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Actor
{
    //variables
    GreenfootImage imagen;
    String mensaje;
    
    //perdio
    public GameOver()
    {
        imagen=new GreenfootImage(400,300);
        imagen.setColor(new Color(250,100,0,255));
        imagen.setFont(new Font("Verdana",34));
        imagen.drawString("Juego Terminado",0,30);
        setImage(imagen);
        Greenfoot.stop();
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
