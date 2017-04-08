import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Timer extends Actor
{
    //variables
    private GreenfootImage imagen;
    private int cont;
    private int real;
    private String mensaje;
    
    //constructor
    public Timer(int time,String msj,int r ){
        cont=time;
        this.real=r;
        mensaje=msj;
        imagen=new GreenfootImage(250,150);
        imagen.setColor(new Color(200,200,0,255));
        imagen.setFont(new Font("Verdana",24));
        dibuja();
    }
    public void dibuja()
   {
    imagen.clear();
    imagen.drawString(mensaje+real,20,20);
    setImage(imagen);   
   }
   public void decrementar(boolean x)
   {
       if (x==true){
       if ((cont%59)==0){
           real--;
           dibuja();
        }
    }
       cont-=1;
       
       
   }
   public int obtenerValor()
   {
       return real;
   }
   public void setValor(boolean valid)
   {
       if(valid == false){
       this.cont=3540;
       real=60;
       dibuja();}else{
        this.cont = 0;
        real=0;
    }
    }
    public void act() 
    {
        
    }    
}
