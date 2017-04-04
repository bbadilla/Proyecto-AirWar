import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Nivel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nivel extends Actor
{
    GreenfootImage imagen;
    private int nivel;   
    String mensaje;
    int x;
   
    
    public Nivel(int c,String msj)
    {
        nivel =c;
        x= nivel;
        mensaje=msj;
        imagen=new GreenfootImage(200,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",24));
        dibuja();
        
    }
   
   public void dibuja()
   {
    imagen.clear();
    imagen.drawString(mensaje+nivel,20,20);
    setImage(imagen);   
   }
   
   public int getValor()
   {
       return nivel;
   }
   
   public  void incrementarNivel()
   {
      x= nivel;
      if(x==nivel)
      {
           nivel +=1;
           dibuja();
           
      }
   

   }
}