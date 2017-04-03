import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bombardero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bombardero extends Enemigos
{
    /**
     * Act - do whatever the Bombardero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.setLocation(this.getX(), this.getY()+1);
        this.desvanecer_enemigo();
        
        dropBomb();// Add your action code here.
    }    
}
