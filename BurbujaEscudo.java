import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BurbujaEscudo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BurbujaEscudo extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    
 
  

    
    public void act() 
    {
        if(this.isTouching(Enemigos.class)|this.isTouching(Bombardero.class)|this.isTouching(JetsK.class))
        {
          Greenfoot.playSound("Explosion.wav");
          this.removeTouching(Enemigos.class);
          //this.getWorld().removeObject(this); 
      
       
         }
        
        
        tocarBomb();
        mover();
        termino();
    }
    
    public void mover(){
        int x = getX();
        int y = getY(); 
        if(Greenfoot.isKeyDown("up")){
        y = y-5;
        setLocation(getX(), y);    
            
        }
        if(Greenfoot.isKeyDown("down")){
        y = y+5;
        setLocation(getX(), y);       
            
        }
        if(Greenfoot.isKeyDown("left")){
        x = x-5;
        setLocation(x, getY());     
            
        }
        if(Greenfoot.isKeyDown("right")){
        x = x+5;
        setLocation(x, getY());    
            
        }

        
    }
    
    public void termino()
    {
       if(this.getWorldOfType(espacio.class).getTimer().obtenerValor()%10 == 0)
       {
           this.getWorld().removeObject(this); 
        }
       
    }
    
    public void tocarBomb()
    {
     if(this.isTouching(Bomb.class))
     {
      
       
       
       this.removeTouching(Bomb.class);
       
       
         
     }
    }
  
 }