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
        if (ypos < getWorld().getHeight() - 5)
        {
            ypos = ypos + 5;
            setLocation(getX(), ypos);
            killPlayer();
        } else {
            getWorld().removeObject(this);
        }
        
    }
    public void killPlayer()
    {
        Actor player = getOneIntersectingObject(nave.class);
        if(player != null)

{
        
            Greenfoot.playSound("Explosion.wav");
            player.setImage("explosion.png");
            getWorld().addObject(new GameOver(), 300, 200);
            getWorld().removeObject(this);
            Greenfoot.stop();            
            
        }
    }

      
        
    }

    
    


