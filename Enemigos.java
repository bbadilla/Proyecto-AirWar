
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Enemigos extends Actor
{
    //variable
    private int enemyHealth = 1;
    
    //actor
    public void act() 
    {
        // movimiento y llegar al final de la pantalla
        this.setLocation(this.getX(), this.getY()+5);
        dropBomb();
       
        if (this.isTouching(nave.class))
        {
            colision();
        }
        else{this.desvanecer_enemigo();}
        
        
    }  
    
    //valor de vida
    public void damageHealth(int amount)
        {
            if (enemyHealth > 1) //if not dead yet
           {
                enemyHealth -= amount;
            } else {
  
                getWorld().removeObject(this);
            }
        
    } 
    
    //crea el disparo
    public void setShot()
    {
        
        shot xd= new shot(1);
        getWorld().addObject(xd,getX(),getY());
        
    }
    
    //mover
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

    //desvanece 
    public void desvanecer_enemigo()
    {
        if(this.isAtEdge())
        {
            this.getWorld().removeObject(this);  

        }
        
    }
    
    //genera la bomba
    public void dropBomb()
    {
       if (Greenfoot.getRandomNumber(1000) < 10)
        {
            //Greenfoot.playSound("lightsaber.wav");
            getWorld().addObject(new Bomb(), getX(), getY() );
        }    
    }
    
    //colision
    public void colision()
    {
        if(this.isTouching(nave.class))
        {
            this.getWorldOfType(espacio.class).getVida().decrementa();
       
            //this.removeTouching(nave.class);
            getWorld().removeObject(this);
            Greenfoot.playSound("Explosion.wav");
        }
    }
  
}

