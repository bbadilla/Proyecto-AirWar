import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class nave extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int directionShot=0;
    int directionLaser=0;
 
    boolean isShot=false;
    boolean isLaser=false;
    boolean isMisil=false;
    public void nave(){}
    
    public void act() 
    {
        if(this.isTouching(Enemigos.class)|this.isTouching(Bombardero.class)|this.isTouching(JetsK.class))
        {
          //Greenfoot.playSound("Explosion.wav");
          //this.removeTouching(Enemigos.class);
          //this.getWorld().removeObject(this); 
      
       
         }
        
        mover();
        setShot(directionShot);
        
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
    
    public void setShot(int direction){
        if(isShot && Greenfoot.isKeyDown("space")){
            Greenfoot.playSound("shotsound.mp3");
            shot s1= new shot(direction);
            getWorld().addObject(s1,getX(),getY());
            isShot=false;
        }
        if(!isShot && !Greenfoot.isKeyDown("space")){
            isShot=true;
        } 
    }
    
    public void setLaser(int direction){
        if(isShot && Greenfoot.isKeyDown("x")){
            Greenfoot.playSound("shotsound.mp3");
            LaserDisparo ls= new LaserDisparo(direction);
            getWorld().addObject(ls,getX(),getY());
            isLaser=false;
        }
        if(!isShot && !Greenfoot.isKeyDown("x")){
            isLaser=true;
        } 
    
    }
    
    public void setMisil(int direction){
        if(isShot && Greenfoot.isKeyDown("c")){
            Greenfoot.playSound("shotsound.mp3");
            MisilDisparo ms= new MisilDisparo(direction);
            getWorld().addObject(ms,getX(),getY());
            isMisil=false;
        }
        if(!isShot && !Greenfoot.isKeyDown("c")){
            isMisil=true;
        } 
    
    }
    public void dispararController(){
       
       Greenfoot.playSound("shotsound.mp3");
       shot s1= new shot(directionShot);
       getWorld().addObject(s1,getX(),getY());
       isShot=false;    
    }
    public void moverController(String direccion){
        int x = getX();
        int y = getY(); 

        if(direccion.equals("left")){
        x = x-40;
        setLocation(x, getY());     
            
        }
        if(direccion.equals("right")){
        x = x+40;
        setLocation(x, getY());    
        }

        
    }
   
  
    
}
