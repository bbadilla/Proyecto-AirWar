import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


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
