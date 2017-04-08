import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class JetsK extends Enemigos
{
   
    public void act() 
    {
        
        this.setLocation(this.getX(), this.getY()+15);
         if (this.isTouching(nave.class))
        {
            this.colision();
        }
        else
        {
            this.desvanecer_enemigo();
        }
        
    }    
}
