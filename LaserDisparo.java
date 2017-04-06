import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerDisparo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LaserDisparo extends Actor
{
    int shotImage=1;
    int speedShot=6;
    int position;
    public LaserDisparo(int direction){
        position=direction;
        
    }
    
    public void movimiento()
    {
        switch(position){
            case 0:
                this.setLocation(this.getX(),this.getY()-speedShot);
            break;
            case 1:
                this.setLocation(this.getX(),this.getY()+speedShot);
            break;
            case 2:
                this.setLocation(this.getX()+speedShot,this.getY());
            break;
            case 3:
                this.setLocation(this.getX()-speedShot,this.getY());
            break;
        }
    }
    public void act() 
    {
        // Add your action code here.
        movimiento();
        // si la bala toca la nave entra shooting sino a desvanecer
        if(this.isTouching(Enemigos.class)){
        this.shooting();}
        else{
        this.desvanecer();}
    }
    
    //metodo para eliminar enemigo
     public void shooting()
     {
     if(this.isTouching(Enemigos.class))
     {
       Greenfoot.playSound("ed.mp3");
       this.getWorldOfType(espacio.class).getTablero().incrementar();
       
       this.removeTouching(Enemigos.class);
       
       
         
     }
        
    }
    
    //metodo para cuando el disparo desvanezca cuando sale de la pantalla
     public void desvanecer()
    {
        if(this.isAtEdge())
        {
            this.getWorld().removeObject(this);  

        }
        
        
        
    }
}

