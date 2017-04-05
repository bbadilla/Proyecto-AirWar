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
    GreenfootImage img2 = new GreenfootImage("nivel3.jpg");
    GreenfootImage img3 = new GreenfootImage("nivel4.jpg");
    GreenfootImage img4 = new GreenfootImage("nivel5.jpg");
    GreenfootImage img5 = new GreenfootImage("nivel6.jpg");
    
    
    private int imageCount = 0;
    public int timer=3540;
    public int realTime=60;
    public lifes objLife;
    Tablero puntos;
    lifes vidas;
    Nivel nivel;
    Timer time;
    GameOver perdio;

    //Song de los niveles
    private GreenfootSound backgroundMusic = new GreenfootSound("1.mp3");
    private GreenfootSound backgroundMusic2 = new GreenfootSound("2.mp3");
    private GreenfootSound backgroundMusic3 = new GreenfootSound("3.mp3");
    
    public espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        nave n1=new nave();
        addObject(n1,400,500);
        vidas= new lifes(3,"Vidas:");
        time=new Timer(timer,"Tiempo: ",realTime);
        puntos=new Tablero(0,"Puntaje:");
        nivel = new Nivel(1, "Nivel:");
        addObject(nivel, 700, 85);
        addObject(puntos,150,85);
        addObject(vidas,300,85);
        addObject(time,450,85);
        addObject(vidas,300,85);
        setBackground(img0);
        
        
        
    }
    public void started()
    {
       backgroundMusic.playLoop();
    }
    public void stopped()
    {
        backgroundMusic.pause();
        backgroundMusic2.pause();
        backgroundMusic3.pause();
    }
    
    public Tablero getTablero()
    {
        return this.puntos;
    }
    
    public lifes getVida()
    {
        return this.vidas;
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
           backgroundMusic3.playLoop();
           backgroundMusic2.pause();
        }
        if (this.nivel.getValor()==4)
        {
           setBackground(img3);
        
        }
        if (this.nivel.getValor()==5)
        {
           setBackground(img4);
        
        }
        if (this.nivel.getValor()==6)
        {
           setBackground(img5);
        
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
    
    public void gameOver()
    {
        if(this.vidas.getVida()==0)
        {
            Greenfoot.playSound("GameOver.mp3");
            perdio = new GameOver();
            addObject(perdio, 450, 400);
        }
    }
    
    public void act()
    {
        
        

        getTimer().decrementar();
        CambiaEscena();
        SubirNivel();
        gameOver();
        
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
