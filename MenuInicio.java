import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuInicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuInicio extends World implements ButtonResponder
{

    /**
     * Constructor for objects of class MenuInicio.
     * 
     */
    public MenuInicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        setBackground("space.jpg");
        addObject(new Button("Iniciar",this),100,100);
        addObject(new Button("Cerrar",this),100,150);
        //addObject(new Button("Cargar",this),100,100);
        //addObject(new Button("Guardar",this),100,100);
        //addObject(new Button("Cambiar nave",this),100,100);
        //addObject(new Button("Cambiar color",this),100,100);
        
        
    }
     public void clickBoton(Button button)
    {
        if ("Iniciar".equals(button.getTitle()) ) {
            World newWorld = new espacio();
            Greenfoot.setWorld(newWorld);
            getBackground().setColor(greenfoot.Color.GRAY);
            getBackground().fill();
            
        }
    }
    
    }
