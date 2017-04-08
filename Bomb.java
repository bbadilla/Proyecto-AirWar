import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Bomb extends Actor
{
    //variable
    private int vidas=3;
   
    public void act() 
    {
        
       if (this.isTouching(nave.class))
        {
            this.killPlayer();
        }
        else
        {
            this.moveDown();
        }
    }    
    //mover
    public void moveDown()
    {
        int ypos = getY(); 
        if (ypos < getWorld().getHeight() - 2)
        {
            ypos = ypos + 7;
            setLocation(getX(), ypos);
            //killPlayer();
        } else {
            getWorld().removeObject(this);
        }
        
    }
    
    //matar jugador
    public void killPlayer()
    {

       Greenfoot.playSound("ed.mp3");
       this.getWorldOfType(espacio.class).getVida().decrementa();
       
        //this.removeTouching(nave.class);
        getWorld().removeObject(this);
        Greenfoot.playSound("Explosion.wav");
    }

      
        
    }

    
    


