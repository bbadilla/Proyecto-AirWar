import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemigos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemigos extends Actor
{
    private int enemyHealth = 1;
    /**
     * Act - do whatever the Enemigos wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // movimiento y llegar al final de la pantalla
        this.setLocation(this.getX(), this.getY()+5);
        this.desvanecer_enemigo();
        
        dropBomb();
    }  
    public void damageHealth(int amount)
        {
            if (enemyHealth > 1) //if not dead yet
           {
                enemyHealth -= amount;
            } else {
  
                getWorld().removeObject(this);
            }
        
    } 
    public void setShot()
    {
        
        shot xd= new shot(1);
        getWorld().addObject(xd,getX(),getY());
        
    }
    public void moveDown()
    {
        int ypos = getY(); // get the current position
        // check  the missle hasn't reached the top
        if (ypos < getWorld().getHeight() - 5)
        {
            ypos = ypos + 5;
            setLocation(getX(), ypos);
        } else {
            getWorld().removeObject(this);
        }
        
        
    }

    
    
    public void desvanecer_enemigo()
    {
        if(this.isAtEdge())
        {
            this.getWorld().removeObject(this);  

        }
        
    }
    public void dropBomb()
    {
       if (Greenfoot.getRandomNumber(1000) < 10)
        {
            //Greenfoot.playSound("lightsaber.wav");
            getWorld().addObject(new Bomb(), getX(), getY() );
        }    
    }
  
    
}
