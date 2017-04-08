import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TorreMisil extends Enemigos
{
    private int enemyHealth = 2;
    /**
     * Act - do whatever the Enemigos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // movimiento y llegar al final de la pantalla
        this.setLocation(this.getX(), this.getY()+1);
        dropBomb();
       
        if (this.isTouching(nave.class))
        {
            colision();
        }
        else{this.desvanecer_enemigo();}
        
        
    }  
 
}