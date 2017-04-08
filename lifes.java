import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class lifes extends Actor
{
    //variables
    GreenfootImage imagen;
    private int vidas;   
    String mensaje;
    int x;
   
   
    //contructor
    public lifes(int c,String msj)
    {
        //crea la vida
        vidas =c;
        mensaje=msj;
        imagen=new GreenfootImage(200,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",24));
        dibuja();
        
    }
    
     public void dibuja()
   {
    imagen.clear();
    imagen.drawString(mensaje+vidas,20,20);
    setImage(imagen);   
   }
   
   public int getVida()
   {
       return vidas;
       
   }
   
   public void incrementar()
   {
       vidas+=1;
       dibuja();
    }
    
   public void decrementa()
   {
       vidas-=1;
       dibuja();
    }
    
    
    
    
    
    
    
    
    
    
}