import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class TorreMisil extends Enemigos
{
    //vida
    private int enemyHealth = 2;
  
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