import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Misil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Misil extends Actor
{
    
     public void agarra()
    {
         if(this.isTouching(nave.class))
         {
           this.getWorldOfType(espacio.class).pushPilaMisil();
           this.getWorld().removeObject(this); 
        }
    }
    public void act() 
    {
        // Add your action code here.
        agarra();
    }    
}
