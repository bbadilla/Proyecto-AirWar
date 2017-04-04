import greenfoot.*;
import java.util.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class espacio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class espacio extends World
{

    /**
     * Constructor for objects of class espacio.
     * 
     */
    
    //Imagenes de los niveles
    GreenfootImage img0 = new GreenfootImage("nivel1.jpg");
    GreenfootImage img1 = new GreenfootImage("nivel2.jpg");
    GreenfootImage img2 = new GreenfootImage("space.jpg");
    
    
    
    private int imageCount = 0;
    public int timer=3540;
    public int realTime=60;
    public lifes objLife;
    Tablero puntos;
    Tablero vidas;
    Nivel nivel;
    Timer time;
    private GreenfootSound backgroundMusic = new GreenfootSound("Nivel1.mp3");
    private GreenfootSound backgroundMusic2 = new GreenfootSound("Nivel2.mp3");
    public espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        nave n1=new nave();
        addObject(n1,400,500);
        objLife=new lifes();
        time=new Timer(timer,"Tiempo: ",realTime);
        puntos=new Tablero(0,"Puntaje:");
        vidas=new Tablero(3,"Vidas:");
        nivel = new Nivel(1, "Nivel:");
        addObject(nivel, 700, 85);
        addObject(puntos,150,85);
        addObject(vidas,300,85);
        addObject(time,450,85);
        setBackground(img0);
        
        
        
    }
    public void started()
    {
       backgroundMusic.playLoop();
    }
    public void stopped()
    {
        backgroundMusic.pause();
    }
    
    public Tablero getTablero()
    {
        return this.puntos;
    }
    public Timer getTimer()
    {
        return this.time;
    }
    
    public void CambiaEscena()
    {
        if (this.nivel.getValor()==2)
        {
            setBackground(img1);
            backgroundMusic2.playLoop();
            backgroundMusic.pause();
        }
        if (this.nivel.getValor()==3)
        {
           setBackground(img2);
        
        }
    
    }
    
    public void SubirNivel()
    {
         if(this.time.obtenerValor() == 0)
        {
            this.time.setValor();
            nivel.incrementarNivel();
        }

    
    }
    
    public void act()
    {
        
        

        getTimer().decrementar();
        CambiaEscena();
        SubirNivel();
        
        if(Greenfoot.getRandomNumber(300) < 2)
        {
            
            this.addObject(new Enemigos(), Greenfoot.getRandomNumber(500)+50 , 50);  

        }
        if(Greenfoot.getRandomNumber(400) < 2)
        {
            
            this.addObject(new Bombardero(), Greenfoot.getRandomNumber(500)+50 , 50);  
            
        }
        if(Greenfoot.getRandomNumber(1000) < 2)
        {
           
            this.addObject(new JetsK(),Greenfoot.getRandomNumber(500)+50, 50);  
        }
        
       
    }
    


}
