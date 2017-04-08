import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)




public class Tablero extends Actor
{
    // variables
    private GreenfootImage imagen;
    private int cont;
    private String mensaje;
    
    public Tablero(int c,String msj)
    {
        //asigna como se ve el tablero
        cont=c;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",24));
        dibuja();
    }
   
   public void dibuja()
   {
    imagen.clear();
    imagen.drawString(mensaje+cont,20,20);
    setImage(imagen);   
   }
   
    public void incrementar()
   {   
       cont+=5;
       dibuja();
    }
    
   public void decrementar()
   {
       cont-=5;
       dibuja();
   }
   
   public  int obtenerValor()
   {
       return cont;
   }
   
    public void act() 
    {
        // Add your action code here.
    }    
}
