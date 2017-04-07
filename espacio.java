import greenfoot.*;
import java.util.*;  
import java.awt.*;


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
    int directionLaser=0;
    int directionMisil=0;
    int x = 0;
    
    
    Tablero puntos;
    lifes vidas;
    Nivel nivel;
    Timer time;
    GameOver perdio;
    pilaPower pila ;
    Escudo escudo;
    Misil misil;
    Laser laser;
    nave n1;
    BurbujaEscudo es;
    ListaTorres listaT;
    Torre torre; 
    TorreMisil torreM;
    
    private GreenfootSound backgroundMusic = new GreenfootSound("Nivel1.mp3");
    private GreenfootSound backgroundMusic2 = new GreenfootSound("Nivel2.mp3");
    
    public espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        n1=new nave();
        addObject(n1,400,500);
        vidas= new lifes(3,"Vidas:");
        time=new Timer(timer,"Tiempo: ",realTime);
        puntos=new Tablero(0,"Puntaje:");
        nivel = new Nivel(1, "Nivel:");
        addObject(nivel, 700, 85);
        addObject(puntos,150,85);
        addObject(time,450,85);
        addObject(vidas,300,85);
        setBackground(img0);
        
        //powerUps
        pila = new pilaPower();
        escudo = new Escudo();
        laser = new Laser();
        misil = new Misil();
        es=new BurbujaEscudo();
        
        listaT = new ListaTorres();
        torre = new Torre();
        torreM = new TorreMisil();
        
        
    }
    
    public void started()
    {
       backgroundMusic.playLoop();
    }
    
    public void stopped()
    {
        backgroundMusic.pause();
        backgroundMusic2.pause();
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
            perdio = new GameOver();
            addObject(perdio, 450, 400);
        }
    }
    
    public void vidaNueva()
    {
        if((this.puntos.obtenerValor()%100)==0 && this.puntos.obtenerValor()!=0)
        {
            this.vidas.incrementar();
            this.puntos.incrementar();
        }
    }
    
    public void pushPilaEscudo()
    {   
         this.pila.push(escudo);  
         
        
      
    }
    public void pushPilaLaser()
    {
        this.pila.push(laser); 
        
        
    }
    public void pushPilaMisil()
    {
        this.pila.push(misil);
        
    }
    
    public void aparecerPowers()
    {
        if(this.getTimer().obtenerValor()==50)
        {
            addObject(escudo, Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(550)+85);    
        }
        
        if(this.getTimer().obtenerValor()==30)
        {
            addObject(misil, Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(550)+85);    
        }
        
       if((this.puntos.obtenerValor()%50)==0 && this.puntos.obtenerValor()!=0)
        {
            this.puntos.incrementar();
            addObject(laser, Greenfoot.getRandomNumber(700),Greenfoot.getRandomNumber(550)+85); 
        }
    }

    public void activarPowers()
    {
       
            if(this.pila.peek() == this.misil)
            {   
                this.n1.setMisil(directionMisil);
                
            }
            if(this.pila.peek() == this.laser)
            {
                this.n1.setLaser(directionLaser);
                
            }
            if(this.pila.peek() == this.escudo)
            {
                
                addObject(es,n1.getX(),n1.getY());
                
            }  
    }
   
    
    public void popPower()
    {
        if (this.getTimer().obtenerValor()%10 == 0)
        {
            pila.pop();
            activarPowers();
        }
        
    }
    
    public void AgregarTorres()
    {
        if(this.getTimer().obtenerValor()==58)
        {
            listaT.agregarFinal(this.torre);
            listaT.agregarFinal(this.torre);
            listaT.agregarFinal(this.torreM);
            listaT.agregarFinal(this.torre);
            listaT.agregarFinal(this.torreM);
            listaT.agregarFinal(this.torre);
            listaT.agregarFinal(this.torreM);
            listaT.agregarFinal(this.torre);
        }
    }
    
    public void dibujarTorres()
    {
        if((this.getTimer().obtenerValor()%10 == 0) && (this.getTimer().obtenerValor()!=60) && (this.getTimer().obtenerValor()!=0))
        {
            if(this.listaT.mostrar()== this.torre)
            {
                addObject(torre, Greenfoot.getRandomNumber(500)+50 , 50);
            }
        
            if(this.listaT.mostrar()== this.torreM)
            {
                addObject(torreM, Greenfoot.getRandomNumber(500)+50 , 50);
            }
        }
    }
    
    public void eliminaTorres()
    {
        if(this.getTimer().obtenerValor()==55 || this.getTimer().obtenerValor()==45 || this.getTimer().obtenerValor()==35 || this.getTimer().obtenerValor()==25 || this.getTimer().obtenerValor()==15 || this.getTimer().obtenerValor()==5)
        {
            this.listaT.eliminarFinal(); 
        
        }
    }

    public void act()
    {
        vidaNueva();
        getTimer().decrementar();
        CambiaEscena();
        SubirNivel();
        gameOver();
        aparecerPowers();
        activarPowers();
        popPower();
        AgregarTorres();
        dibujarTorres();
        eliminaTorres();
        
        
        if(Greenfoot.getRandomNumber(10) < 2)
        {
           
            this.addObject(new Stars(),Greenfoot.getRandomNumber(800)+50, 50);  
        }
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
