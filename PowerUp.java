import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EScudo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Actor
{
    public void asignar()
    {
        if(this.isTouching(nave.class))
        {
           this.getWorldOfType(espacio.class).pushPila();
        }
    
    }
    public void act() 
    {
        // Add your action code here.
    }    
}
