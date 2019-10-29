import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class destroyable here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
   public int lives = 80;
   public int magazineSize=5;
   private int speed=0;
   private int turning = 30;
   private int delay = 15;
   private int fireSpeed=delay;
   private int reloadTime=0;
   private int maxSpeed=0;
   private boolean forward = true;
   private int mag = 5;
   private boolean icon;
   
   
   public Player (boolean icon)
   {
      GreenfootImage Player = getImage();
      turning = 0;
     
      setImage(Player);
      this.icon=icon;
   }
   
   public Player (int lives, int speed, boolean icon)
   {
       this.lives = lives;
       this.icon = icon;
       maxSpeed = speed;
       turning = 6;
       this.speed=maxSpeed;
       GreenfootImage player = getImage();
        
       setImage(player);
   }
   
   
     
    public void act() 
    {
        movement();
        touchingObs();
        if(getLives()<=0)
        {
            getWorld().getBackground().drawImage(new GreenfootImage("Game Over", 64, null, null), 40, 600);
            Greenfoot.stop();
        }
    }    
    public int howManyLives()
    {
        return lives;
    }

   public void movement()
   {      
            speed=maxSpeed;
            collisions();
            
            
            if(Greenfoot.isKeyDown("Up") || Greenfoot.isKeyDown("W"))
            {
                setRotation(-turning);
                setLocation(getX(), getY()-5);
                forward=true;
                touchingObs();
            }//end of Up
            else if(Greenfoot.isKeyDown("Down") || Greenfoot.isKeyDown("S"))
            {
                setRotation(turning);
                setLocation(getX(), getY()+5);
                forward=false;
                touchingObs();
            }
            else if(Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("A"))
            {
                setRotation(0);
                move(-speed+2);
            }
            else
            {
                setRotation(0);
                if(Greenfoot.isKeyDown("right")  || Greenfoot.isKeyDown("D"))
                {
                    move(speed);
                }
            }
    }
   public void collisions()
   {
       
       //Actor obstacle = null;
       //obstacle = isTouching(destroy)
       if(icon ==true)
       {}//DOES NOTHING IF IT IS JUST AN ICON
       else
       {
           if(getY()<=90)
            {
                setLocation(getX(), 90);
               
            }
           else if(getY()>=445)    
           {
                setLocation(getX(), 445);
           }//checks for bottom wall collision
           else
           {
               if(getX()<=25)
               {
                    setLocation(25, getY());
               }//checks for left wall collision
               if(getX()>=665)
                {
                    setLocation(665, getY());
                }//checks for right wall collision
            }//checks to see if hiting the right or left walls
        }//if it is not an icon check for collisiosn.
  }// cecks collsiions
  
  public void touchingObs()
  {
      
      if(isTouching(Tile.class))
      {
          Actor obs = getOneObjectAtOffset(0,0, Tile.class);
            if(isTouching(Tile.class))
            {
                takeHealth();
            }
      }

    }

    
   public int getSpeed()
   {
       return speed;
   }
   public int getDelay()
   {
       return delay;
   }
   public int getReloadTime()
   {
       return reloadTime;
   }
   public int getMagazineSize()
   {
       return magazineSize;
   }
   public void setMagazineSize(int s)
   {
      mag=s;
   }
   public int getMaxSpeed()
   {
       return maxSpeed;
   }
   public int getLives()
   {
       return lives;
    }
    public void takeHealth()
   {
       lives--;
    }
   public void decreesAmmo()
   {
       magazineSize--;
   }
}



