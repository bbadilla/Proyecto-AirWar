import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Enemigos
{
    /**
     * Act - do whatever the Boss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        moveAround();
        dropBomb();
        
         if (this.isTouching(nave.class)){
          int enemyHealth = 3;
          if (enemyHealth > 1)
          {
            enemyHealth -= 1;
          }else
         {
            this.colision();
         }
    }
    } 
    private int velocity = 3;
            public void moveAround()
        {
           move(velocity);
            if(isAtEdge())
            {
                velocity = velocity * -1;
            }

    } 
}
