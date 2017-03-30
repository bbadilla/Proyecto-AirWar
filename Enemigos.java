import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    /**
     * Act - do whatever the Enemigos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // movimiento y llegar al final de la pantalla
        this.setLocation(this.getX(), this.getY()+2);
        this.desvanecer_enemigo();
    }    
    
    public void desvanecer_enemigo()
    {
        if(this.isAtEdge())
        {
            this.getWorld().removeObject(this);  

        }
        
    }
  
    
}
