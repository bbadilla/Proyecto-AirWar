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
    GreenfootImage img1 = new GreenfootImage("nivel1.jpg");
    GreenfootImage img2 = new GreenfootImage("nivel2.jpg");
    GreenfootImage img3 = new GreenfootImage("nivel3.jpg");
    GreenfootImage img4 = new GreenfootImage("nivel4.jpg");
    GreenfootImage img5 = new GreenfootImage("nivel5.jpg");
    GreenfootImage img6 = new GreenfootImage("nivel6.jpg");
    GreenfootImage img7 = new GreenfootImage("nivel7.jpg");
    GreenfootImage img8 = new GreenfootImage("nivel8.jpg");
    GreenfootImage img9 = new GreenfootImage("nivel9.jpg");
    GreenfootImage img10 = new GreenfootImage("nivel10.jpg");
    
    
    
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
    Boss boss;
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
    
    private GreenfootSound backgroundMusic = new GreenfootSound("1.mp3");
    private GreenfootSound backgroundMusic2 = new GreenfootSound("2.mp3");
    private GreenfootSound backgroundMusic3 = new GreenfootSound("3.mp3");
    private GreenfootSound backgroundMusic4 = new GreenfootSound("4.mp3");
    private GreenfootSound backgroundMusic5 = new GreenfootSound("5.mp3");
    private GreenfootSound backgroundMusic6 = new GreenfootSound("6.mp3");
    private GreenfootSound backgroundMusic7 = new GreenfootSound("7.mp3");
    private GreenfootSound backgroundMusic8 = new GreenfootSound("8.mp3");
    private GreenfootSound backgroundMusic9 = new GreenfootSound("9.mp3");
    private GreenfootSound backgroundMusic10 = new GreenfootSound("10.mp3");
    
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
        setBackground(img1);
        
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
        backgroundMusic3.pause();
        backgroundMusic4.pause();
        backgroundMusic5.pause();
        backgroundMusic6.pause();
        backgroundMusic7.pause();
        backgroundMusic8.pause();
        backgroundMusic9.pause();
        backgroundMusic10.pause();
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
            setBackground(img2);
            backgroundMusic2.playLoop();
            backgroundMusic.pause();
        }
        if (this.nivel.getValor()==3)
        {
          setBackground(img3);
          backgroundMusic3.playLoop();
          backgroundMusic2.pause();
        }
        if (this.nivel.getValor()==4)
        {
           setBackground(img4);
           backgroundMusic4.playLoop();
           backgroundMusic3.pause();
        }
        if (this.nivel.getValor()==5)
        {
           setBackground(img5);
           backgroundMusic5.playLoop();
           backgroundMusic4.pause();
        }
        if (this.nivel.getValor()==6)
        {
           setBackground(img6);
           backgroundMusic6.playLoop();
           backgroundMusic5.pause();
        }
        if (this.nivel.getValor()==7)
        {
           setBackground(img7);
           backgroundMusic7.playLoop();
           backgroundMusic6.pause();
        }
        if (this.nivel.getValor()==8)
        {
           setBackground(img8);
           backgroundMusic8.playLoop();
           backgroundMusic7.pause();
        }
        if (this.nivel.getValor()==9)
        {
           setBackground(img9);
           backgroundMusic9.playLoop();
           backgroundMusic8.pause();
        }
        if (this.nivel.getValor()==10)
        {
           setBackground(img10);
           backgroundMusic10.playLoop();
           backgroundMusic9.pause();
        }
        if (this.nivel.getValor()==11){
            perdio = new GameOver();
            addObject(perdio, 450, 400);  
        }
    }
    
    public void SubirNivel()
    {
         if(this.time.obtenerValor() == 0)
        { 
            
            this.time.setValor(true);
            nivel.incrementarNivel();
        }

    
    }
    public  void Boss()
    {
       this.addObject(boss = new Boss(),Greenfoot.getRandomNumber(500)+50, 100);  
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
        if(this.getTimer().obtenerValor()==49)
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
        AgregarTorres();
        dibujarTorres();
        eliminaTorres();
        if(this.getTimer().obtenerValor()!= 0){
        this.time.decrementar(true);
        vidaNueva();
        gameOver();
        aparecerPowers();
        activarPowers();
        popPower();
        started();
        if(Greenfoot.getRandomNumber(10) < 2)
        {
           
            this.addObject(new Stars(),Greenfoot.getRandomNumber(800)+50, 50);  
        }
        if(this.time.obtenerValor() > 0){
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
        else{
            Boss();
            SubirNivel();
            CambiaEscena();
            time.setValor(false);
            this.time.decrementar(true);
            
        }

        
}


}
