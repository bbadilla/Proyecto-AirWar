import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    private int vidas=3;
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveDown();
    }    
    
    public void moveDown()
    {
        int ypos = getY(); // get the current position
        // check  the missle hasn't reached the top
        if (ypos < getWorld().getHeight() - 2)
        {
            ypos = ypos + 7;
            setLocation(getX(), ypos);
            //killPlayer();
        } else {
            getWorld().removeObject(this);
        }
        
    }
    public void killPlayer()
    {

        if(this.isTouching(nave.class))
     {
            Greenfoot.playSound("ed.mp3");
            this.removeTouching(nave.class);
            getWorld().removeObject(this);
            Greenfoot.playSound("Explosion.wav");



            //Greenfoot.stop();  
           
            //getWorld().addObject(new nave(),400,500);
            
        }
    }

      
        
    }

    
    


