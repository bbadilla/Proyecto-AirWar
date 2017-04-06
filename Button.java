import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private String title;
    private ButtonResponder world;
    
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Button(String title, ButtonResponder world)
    {
        this.title = title;
        putTextOnImage();
        this.world = world;
    }
    private void putTextOnImage()
    {
        GreenfootImage backgroundImage = new GreenfootImage(getImage());
        GreenfootImage text = new GreenfootImage(title, 22, Color.BLACK, new Color(0,0,0,0));
        
        if (text.getWidth() > backgroundImage.getWidth() - 20) {
            backgroundImage.scale(text.getWidth() + 20, backgroundImage.getHeight());
        }
        
        int x = (backgroundImage.getWidth() -text.getWidth() ) /2;
        int y = (backgroundImage.getHeight() -text.getHeight() ) /2;
        backgroundImage.drawImage(text, x, y);
        setImage(backgroundImage);
    }
    
    public void act() 
    {
        if (Greenfoot.mouseClicked(this)) {
            world.clickBoton(this);
        }
        
    }
     public String getTitle()
    {
        return title;
    }
}