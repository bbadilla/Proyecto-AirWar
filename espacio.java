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
    public lifes objLife;
    Tablero puntos;
    Tablero vidas;
    public espacio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        nave n1=new nave();
        addObject(n1,400,500);
        objLife=new lifes();
        puntos=new Tablero(0,"Puntaje:");
        vidas=new Tablero(3,"Vidas:");
        addObject(puntos,150,85);
        addObject(vidas,300,85);
    }
    
    
    public Tablero getTablero()
    {
        return this.puntos;
    }
        
    public void act()
    {
        if(Greenfoot.getRandomNumber(100) < 2)
        {
            this.addObject(new Enemigos(), Greenfoot.getRandomNumber(700) + 50, 50);  

        }
    }
  

}
