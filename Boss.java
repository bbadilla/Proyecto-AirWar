import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Boss extends Enemigos
{
    //actor
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
    //variable velocidad
    private int velocity = 7;
    
    //movimiento de boss
            public void moveAround()
        {
           move(velocity);
            if(isAtEdge())
            {
                velocity = velocity * -1;
            }

    } 
}
