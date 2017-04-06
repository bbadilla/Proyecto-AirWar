import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stars extends Actor
{
    private static final int SIZE = 3;
    private int speed;
    
    public Stars()
    {
        GreenfootImage ima = new GreenfootImage(SIZE, SIZE);
        int color = Greenfoot.getRandomNumber(256);
        ima.setColor(new greenfoot.Color(color, color, color));
        ima.fillOval(0,0,SIZE, SIZE);
        setImage(ima);
        
        speed = Greenfoot.getRandomNumber(5)+1;
    }
    
     public void desvanecer()
    {
      
         this.getWorld().removeObject(this);  

    }
    
    public void act() 
    {
        // Add your action code here.
        
        if(this.isAtEdge())
        {
           desvanecer();

        }
        
        else
        {
            setLocation(getX(), getY()+speed);
            if (getY()< SIZE)
            {
                int x = Greenfoot.getRandomNumber(getWorld().getWidth());
                int y = getWorld().getWidth()+SIZE;
                setLocation(x,y);
            }
        }
        
    }    
}
