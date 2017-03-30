import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class nave extends Actor
{
    public static final int UP=0;
    public static final int DOWN=1;
    public static final int LEFT=2;
    public static final int RIGHT=3;
    int directionShot=0;
    boolean isShot=false;
    public void nave(){
        
    }
    public void act() 
    {
        if(Greenfoot.isKeyDown("up")){
            setDireccion(UP);
            
        }
        if(Greenfoot.isKeyDown("down")){
            setDireccion(DOWN);
            
        }
        if(Greenfoot.isKeyDown("left")){
            setDireccion(LEFT);
            
        }
        if(Greenfoot.isKeyDown("right")){
            setDireccion(RIGHT);
            
        }
        setShot(directionShot);
       
    }
    public void setShot(int direction){
        if(isShot && Greenfoot.isKeyDown("x")){
            shot s1= new shot(direction);
            getWorld().addObject(s1,getX(),getY());
            isShot=false;
        }
        if(!isShot && !Greenfoot.isKeyDown("x")){
            isShot=true;
        } 
    }
    public void setDireccion(int direccion){
        switch(direccion){
            case UP:
            if(Greenfoot.isKeyDown("space")){
            setLocation(getX(),getY()-10);
        }
        else{
            setLocation(getX(),getY()-1);
        }
            break;
            case DOWN:
  
             if(Greenfoot.isKeyDown("space")){
            setLocation(getX(),getY()+10);
        }else{
            setLocation(getX(),getY()+1);
        }
            break;
            case LEFT:
 
             if(Greenfoot.isKeyDown("space")){
            setLocation(getX()-10,getY());
        }else{
            setLocation(getX()-1,getY());
        }
            break;
            case RIGHT:
             if(Greenfoot.isKeyDown("space")){
            setLocation(getX()+10,getY());
        }else{
            setLocation(getX()+1,getY());
        }
            break;
        }
    }
}
