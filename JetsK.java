import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class JetsK here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JetsK extends Enemigos
{
    /**
     * Act - do whatever the JetsK wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        this.setLocation(this.getX(), this.getY()+15);
        this.desvanecer_enemigo();
        
        
    }    
}
