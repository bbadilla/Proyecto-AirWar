import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bombardero extends Enemigos
{
    //actor
    public void act() 
    {
        this.setLocation(this.getX(), this.getY()+1);
        dropBomb();// Add your action code here.
        
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
