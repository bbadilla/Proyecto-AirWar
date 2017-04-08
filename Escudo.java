import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Escudo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Escudo extends Actor
{
  
     public void agarra()
    {
         if(this.isTouching(nave.class))
         {
           this.getWorldOfType(espacio.class).pushPilaEscudo();
           this.getWorld().removeObject(this); 
        }
    }
    
  
    public void act() 
    {
        agarra();
        // Add your action code here.
    }    
}
