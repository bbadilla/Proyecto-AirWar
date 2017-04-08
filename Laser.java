import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Laser extends Actor
{
    
     public void agarra()
    {
         if(this.isTouching(nave.class))
         {
           this.getWorldOfType(espacio.class).pushPilaLaser();
           this.getWorld().removeObject(this); 
        }
    }
    public void act() 
    {
        
        agarra();
    }    
}
