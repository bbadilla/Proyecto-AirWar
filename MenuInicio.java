import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MenuInicio extends World implements ButtonResponder
{
    
    private GreenfootSound backgroundMusic = new GreenfootSound("1.mp3");

    public MenuInicio()
    {    
        // Create a new world with 800x600 cells with a cell size of 1x1 pixels.
        super(800, 600, 1);
        
        addObject(new Button("Iniciar",this),175,100);
        addObject(new Button("Cerrar",this),600,100);
       
        
    }
     public void clickBoton(Button button)
    {
        if ("Iniciar".equals(button.getTitle()) ) {
            World newWorld = new espacio();
            Greenfoot.setWorld(newWorld);
            getBackground().setColor(greenfoot.Color.GRAY);
            getBackground().fill();
            
            
        }
        
        if ("Cerrar".equals(button.getTitle()) ) {
           Greenfoot.stop();
            
        }
    }
 }


